import CodeClanCars.Customer;
import Vehicles.Electric;
import Vehicles.Hybrid;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    Customer customer;
    Customer customerNoLicense;
    Customer customerNoMoney;

    Petrol car1;
    Hybrid car2;
    Electric car3;

    @Before
    public void before() {
        customer = new Customer("Bob", 10000, true);
        customerNoLicense = new Customer("Bob", 10000, false);
        customerNoMoney = new Customer("Bob", 0, true);

        car1 = new Petrol("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car2 = new Hybrid("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car3 = new Electric("Toyota", "Prius", 4300.00, "Pink", 1.4);
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

    @Test
    public void startsWithNoCars() {
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(car1);
        assertEquals(1, customer.getCars().size());
    }

    @Test
    public void cannotBuyNoLicense() {
        customerNoLicense.buyCar(car1);
        assertEquals(0, customerNoLicense.getCars().size());
    }

    @Test
    public void cannotBuyNoMoney() {
        customerNoMoney.buyCar(car1);
        assertEquals(0, customerNoMoney.getCars().size());
    }
}
