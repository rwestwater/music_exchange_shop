package Stock;

import Instruments.ISell;

public abstract class Accessories implements ISell {

    protected String type;
    protected double buyingPrice;
    protected double sellingPrice;

    public Accessories(String type, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup(){
        return (this.sellingPrice - this.buyingPrice);
    }
}
