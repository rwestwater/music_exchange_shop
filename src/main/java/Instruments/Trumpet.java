package Instruments;

public class Trumpet extends Instrument implements IPlay {

    private int noOfKeys;

    public Trumpet(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice,
                   double sellingPrice, String brand, int noOfKeys) {
        super(type, instrumentType, materialType, colour, buyingPrice, sellingPrice, brand);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}