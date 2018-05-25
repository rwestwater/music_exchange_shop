import Stock.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Drumsticks",15, 20);
    }

    @Test
    public void canGetType(){
        assertEquals("Drumsticks", drumsticks.getType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(15, drumsticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(20, drumsticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, drumsticks.calculateMarkup(), 0.01);
    }
}
