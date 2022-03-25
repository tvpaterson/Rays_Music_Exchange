import Rays.instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Oak", "Blue", "Classic", 5);
    }

    @Test
    public void hasPieces(){
        assertEquals(5, drums.getPieces());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", drums.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Oak", drums.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Classic", drums.getType());
    }
}
