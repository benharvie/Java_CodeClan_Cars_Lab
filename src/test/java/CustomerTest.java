import CodeClanCars.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Bob", 10000, true);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(10000, customer.getWallet(), 0.01);
    }

    @Test
    public void hasDrivingLicense() {
        assertTrue(customer.hasDrivingLicense());
    }
}
