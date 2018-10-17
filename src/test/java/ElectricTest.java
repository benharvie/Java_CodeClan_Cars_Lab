import Vehicles.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;

    @Before
    public void before() {
        electric = new Electric("Toyota", "Prius", 4300.00, "Pink", 1.4);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", electric.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", electric.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(4300.00, electric.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", electric.getColour());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.4, electric.getEngineSize(), 0.01);
    }
}
