package Instruments;

public abstract class Instrument implements IPlay{

    private String type;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;
    private String brand;



    public Instrument(String type, InstrumentType instrumentType, MaterialType materialType, String colour, double buyingPrice, double sellingPrice, String brand){
        this.type = type;
        this.instrumentType = instrumentType;
        this.materialType = materialType;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
    }

    public String getType() {
        return this.type;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public MaterialType getMaterialType() {
        return this.materialType;
    }

    public String getColour() {
        return this.colour;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public String brand(){
        return this.colour;
    }




}


