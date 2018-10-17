import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Engine1", "VW", 2.0);
    }

    @Test
    public void hasMake(){
        assertEquals("Engine1", engine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("VW", engine.getModel());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2.0, engine.getCapacity(), 0.01);
    }
}
