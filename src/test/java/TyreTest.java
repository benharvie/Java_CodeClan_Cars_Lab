import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("Tyre1", "VW", 18.00);
    }

    @Test
    public void hasSize() {
        assertEquals(18.00, tyre.getSize(), 0.01);
    }
}
