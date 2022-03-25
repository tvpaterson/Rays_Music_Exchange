import Rays.instruments.Keyboards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboards keyboard;

    @Before
    public void setUp(){
        keyboard = new Keyboards("Plastic", "White", "Electric", 64);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", keyboard.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("White", keyboard.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", keyboard.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(64, keyboard.getKeys());
    }
}
