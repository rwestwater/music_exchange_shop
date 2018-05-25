import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;
    IPlay iPlay;

    @Before
    public void before() {
        piano = new Piano("Grand Piano", InstrumentType.PERCUSSION, MaterialType.WOOD, "White", 2000.00, 2500.00, "Roland", 8);
    }

    @Test
    public void canGetNoOfOctanes() {
        assertEquals(8, piano.getNoOfOctanes());
    }

    @Test
    public void canGetNoise(){
        assertEquals("You are playing the Grand Piano", piano.getNoise());
    }

}