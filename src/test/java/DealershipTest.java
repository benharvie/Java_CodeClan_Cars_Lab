import CodeClanCars.Dealership;
import Vehicles.Electric;
import Vehicles.Hybrid;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Petrol car1;
    Hybrid car2;
    Electric car3;

    @Before
    public void before() {
        car1 = new Petrol("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car2 = new Hybrid("Toyota", "Prius", 4300.00, "Pink", 1.4);
        car3 = new Electric("Toyota", "Prius", 4300.00, "Pink", 1.4);

        dealership = new Dealership("CodeClan Cars" );
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
        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.addCar(car3);
        assertEquals(3, dealership.getVehicles().size());
    }
}
