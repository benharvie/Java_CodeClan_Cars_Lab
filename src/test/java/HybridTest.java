import Vehicles.Hybrid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;

    @Before
    public void before() {
        hybrid = new Hybrid("Toyota", "Prius", 4300.00, "Pink", 1.4);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", hybrid.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", hybrid.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(4300.00, hybrid.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", hybrid.getColour());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.4, hybrid.getEngineSize(), 0.01);
    }
}
