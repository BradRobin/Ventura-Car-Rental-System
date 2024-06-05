import static org.junit.Assert.*;
import org.junit.Test;

public class TestCustomer {
    public void testCustomerCreation() {
        Customer customer = new Customer("John Doe", "DL12345");
        assertEquals("John Doe", customer.getName());
        assertEquals("DL12345", customer.getDriverLicense());
    }
}
