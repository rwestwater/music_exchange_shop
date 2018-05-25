package Shop;
import Instruments.ISell;
import java.util.ArrayList;

public class Shop{
    private ArrayList<ISell> forSale;

    public Shop(){
        this.forSale = new ArrayList<>();
    }

    public ArrayList<ISell> forSale() {
        return this.forSale;
    }

    public int getStockForSale(){
        return this.forSale.size();
    }

    public void addStockForSale(ISell iSell){
        this.forSale.add(iSell);
    }

    public void removeStockForSale(ISell iSell){
        this.forSale.remove(iSell);
    }

}
