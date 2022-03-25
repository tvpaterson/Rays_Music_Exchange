package Rays.shop;

import java.util.ArrayList;

public class Shop  {
    private ArrayList<Items> stock;

    public Shop(ArrayList<Items> stock) {
        this.stock = stock;

    }

    public int getStock() {
        return stock.size();
    }

    public void addItemToStock(Items items){
        stock.add(items);
    }

    public void removeItemFromStock(Items items){
        stock.remove(items);
    }
}
