package Instruments;

public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;

    public Guitar(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice, double sellingPrice, String brand, int noOfStrings){
        super(type, instrumentType, materialType, colour, buyingPrice, sellingPrice, brand);
        this.noOfStrings = noOfStrings;
    }


    public int getNoOfStrings() {
        return this.noOfStrings;
    }
}
