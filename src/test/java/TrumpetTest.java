import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;
    IPlay iPlay;

    @Before
    public void before() {
        trumpet = new Trumpet("Trumpet", InstrumentType.BRASS, MaterialType.BRASS, "Gold", 300,400, "Bach", 3);
    }

    @Test
    public void canGetNoOfKeys() {
        assertEquals(3, trumpet.getNoOfKeys());
    }

    @Test
    public void canGetNoise(){
        assertEquals("You are playing the Trumpet", trumpet.getNoise());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100.0, trumpet.calculateMarkup(), 0.01);
    }
}
