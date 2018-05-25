import Stock.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Guitar Strings", 5, 10);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, guitarStrings.calculateMarkup(), 0.01);
    }
}
