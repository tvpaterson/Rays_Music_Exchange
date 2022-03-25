import Rays.instruments.Guitars;
import Rays.instruments.Instrument;
import Rays.instruments.Keyboards;
import Rays.shop.Items;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsTest {

    Guitars guitar1;
    Keyboards keyboard1;
    Items item1;
    Items item2;

    @Before
    public void setUp(){
        item1 = new Items(guitar1, 100.00, 150.00);
        item2 = new Items(keyboard1, 190.00, 200.00);
    }

    @Test
    public void priceOfItem(){
        assertEquals(150.00, item1.getSellPrice(), 0.0);
    }

    @Test
    public void item1HasProfit(){
        assertEquals(50.00, item1.calculateMarkUp(), 0.0);
    }

    @Test
    public void item2HasProfit(){
        assertEquals(10.00, item2.calculateMarkUp(), 0.0);
    }
}
