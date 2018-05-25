import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

        Guitar guitar;
        IPlay iPlay;

        @Before
        public void before(){
            guitar = new Guitar("Guitar", InstrumentType.STRING, MaterialType.WOOD, "Black", 550, 700, "Gibson", 6);
        }

        @Test
        public void canGetType(){
            assertEquals("Guitar", guitar.getType());
        }

        @Test
        public void canGetInstrumentType(){
            assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
        }

        @Test
        public void canGetMaterialType(){
            assertEquals(MaterialType.WOOD, guitar.getMaterialType());
        }

        @Test
        public void canGetColour(){
            assertEquals("Black", guitar.getColour());
        }

        @Test
        public void canGetBuyingPrice(){
            assertEquals(550, guitar.getBuyingPrice(), 0.01);
        }

        @Test
        public void canGetSellingPrice(){
        assertEquals(700, guitar.getSellingPrice(), 0.01);
        }

        @Test
        public void canGetBrand(){
        assertEquals("Gibson", guitar.getBrand());
        }

        @Test
        public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
        }

        @Test
        public void canCalculateMarkup(){
                assertEquals(150.0, guitar.getMarkupPrice(), 0.01);


        }


}
