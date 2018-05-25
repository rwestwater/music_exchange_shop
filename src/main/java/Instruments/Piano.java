package Instruments;

public class Piano extends Instrument implements IPlay {
    private int octanes;

    public Piano(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice, double sellingPrice, String brand, int octanes) {
        super(type, instrumentType, materialType, colour, buyingPrice, sellingPrice, brand);
    this.octanes = octanes;
        }


    public int getNoOfOctanes() {
        return this.octanes;
    }

    ;


}
