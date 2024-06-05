import static org.junit.Assert.*;
import java.beans.Transient;
import org.junit.Test;

public class TestCar {

    @Test
    public void testCarCreation() {
        Car car = new car("ABC123", "Toyota");
        assertEquals("ABC123", car.getLicensePlate());
        assertEquals("Toyota", car.getModel());
        assertFalse(car.isRented());
    }

    @Test
    public void testCarRental() {
        Car car = new Car("ABC123", "Toyota");
        car.rentCar();
        assertTrue(car.isRented());
    }

    @Test
    public void testCarReturn() {
        Car car = new Car("ABC123", "Toyota");
        car.rentCar();
        car.returnCar();
        assertFalse(car.isRented());
    }
}
