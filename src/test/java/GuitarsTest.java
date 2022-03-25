import Rays.instruments.Guitars;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarsTest {

    Guitars guitar;

    @Before
    public void setUp(){
        guitar = new Guitars("Birchwood", "Black", "Electric", 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Birchwood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Prince - Purple Rain", guitar.playTune());
    }

}
