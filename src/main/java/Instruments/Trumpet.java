package Instruments;

public class Trumpet extends Instrument implements IPlay {

    public Trumpet(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice,
                   double sellingPrice, String brand, int NoOfKeys) {
        super(type, instrumentType, materialType, colour, buyingPrice, sellingPrice, brand);
    }

}