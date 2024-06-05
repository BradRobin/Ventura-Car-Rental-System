import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Before;
import org.junit.Test;

public class TestRentalAgency {
    private RentalAgency agency;
    private Car car;
    private Customer customer;

    @Before
    public void setUp() {
        agency = new RentalAgency();
        car = new Car("ABC123", "Toyota");
        customer = new Customer("John Doe", "DL12345");
        agency.addCar(car);
        agency.addCustomer(customer);
    }

    @Test
    public void testRentCar() {
        assertTrue(agency.rentCar("ABC123", "DL12345"));
        assertTrue(car.isRented());
    }

    @Test
    public void testReturnCar() {
        agency.rentCar("ABC123", "DL12345");
        assertTrue(agency.returnCar("ABC123"));
        assertFalse(car.isRented());
    }

    @Test
    public void testRentNonExistentCar() {
        assertFalse(agency.rentCar("XYZ999", "DL12345"));
    }

    @Test 
    public void testReturnNonExistentCar() {
        assertFalse(agency.returnCar("XYZ999"));
    }
}
