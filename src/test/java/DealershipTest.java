import CodeClanCars.Customer;
import CodeClanCars.Dealership;
import Vehicles.Electric;
import Vehicles.Hybrid;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    Customer customer;
    Customer customerNoLicense;
    Customer customerNoMoney;

    Petrol car1;
    Hybrid car2;
    Electric car3;

    @Before
    public void before() {
        car1 = new Petrol("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car2 = new Hybrid("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car3 = new Electric("Toyota", "Prius", 4300.00, "Pink", 1.4);

        dealership = new Dealership("CodeClan Cars" );

        customer = new Customer("Bob", 10000, true);
        customerNoLicense = new Customer("Bob", 10000, false);
        customerNoMoney = new Customer("Bob", 0, true);
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Cars", dealership.getName());
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, dealership.getVehicles().size());
    }

    @Test
    public void addsCars() {
        dealership.buyCar(car1);
        dealership.buyCar(car2);
        dealership.buyCar(car3);
        assertEquals(3, dealership.getVehicles().size());
    }

    @Test
    public void canSellCar() {
        dealership.buyCar(car1);
        dealership.buyCar(car2);
        dealership.buyCar(car3);
        assertEquals(3, dealership.getVehicles().size());
        dealership.sellCar(car1, customer);
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void tillStarts50000() {
        assertEquals(50000, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddToTill() {
        dealership.buyCar(car1);
        dealership.sellCar(car1, customer);
    }

    @Test
    public void cannotSellIfCarDoesntExist() {
        dealership.buyCar(car1);
        dealership.buyCar(car3);
        dealership.sellCar(car2, customer);
        assertEquals(2, dealership.getVehicles().size());
    }
}
