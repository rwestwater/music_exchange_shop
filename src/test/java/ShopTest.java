import Instruments.Guitar;
import Instruments.InstrumentType;
import Shop.Shop;
import Instruments.MaterialType;
import Stock.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Guitar", InstrumentType.STRING, MaterialType.WOOD, "Blue", 700, 900, "Fender", 6);
        guitarStrings = new GuitarStrings("Guitar Strings", 5,10);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStockForSale());
    }

    @Test
    public void canAddStockForSale(){
        shop.addStockForSale(guitar);
        shop.addStockForSale(guitarStrings);
        assertEquals(2, shop.getStockForSale());
    }

    @Test
    public void canRemoveStockForSale(){
        shop.addStockForSale(guitar);
        shop.addStockForSale(guitarStrings);
        shop.removeStockForSale(guitarStrings);
        assertEquals(1, shop.getStockForSale());
    }




}
