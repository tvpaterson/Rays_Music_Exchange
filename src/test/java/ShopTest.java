import Rays.instruments.Drums;
import Rays.instruments.Guitars;
import Rays.instruments.Keyboards;
import Rays.shop.Items;
import Rays.shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Items item1;
    Items item2;
    Items item3;
    Guitars guitar1;
    Keyboards keyboard1;
    Drums drum1;


    @Before
    public void setUp(){
        ArrayList<Items> stock = new ArrayList<>();
        shop = new Shop(stock);
        item1 = new Items(guitar1, 100.00, 150.00);
        item2 = new Items(keyboard1, 190.00, 200.00);
        item3 = new Items(drum1, 190.00, 200.00);
    }

    @Test
    public void canAddToStock(){
        shop.addItemToStock(item1);
        shop.addItemToStock(item2);
        shop.addItemToStock(item3);
        assertEquals(3, shop.getStock());
    }

    @Test
    public void canRemoveItems(){
        shop.addItemToStock(item1);
        shop.addItemToStock(item2);
        shop.addItemToStock(item3);
        shop.removeItemFromStock(item1);
        assertEquals(2, shop.getStock());

    }


}
