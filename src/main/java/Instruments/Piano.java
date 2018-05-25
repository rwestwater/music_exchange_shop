package Instruments;

public class Piano extends Instrument implements IPlay {

    public Piano(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice,
                 double sellingPrice, String brand, int octanes) {
        super(type, instrumentType, materialType, colour, buyingPrice, sellingPrice, brand);
        }



}
