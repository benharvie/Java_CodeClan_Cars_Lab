import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol petrol;

    @Before
    public void before() {
        petrol = new Petrol("Toyota", "Prius", 4300.00, "Pink", 1.4);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", petrol.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", petrol.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(4300.00, petrol.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", petrol.getColour());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.4, petrol.getEngineSize(), 0.01);
    }
}
