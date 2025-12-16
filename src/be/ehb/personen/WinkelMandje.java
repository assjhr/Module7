package be.ehb.personen;

import be.ehb.exceptions.KredietLimietException;

import java.util.HashMap;

public class WinkelMandje {

    private HashMap<String, Double> mandje;
    private double krediet;

    public WinkelMandje(double krediet) {
        this.mandje = new HashMap<>();
        this.krediet = krediet;
    }

    public void addToBasket(String productName, double price)throws KredietLimietException{
        if(price < this.krediet) {
            this.krediet -= price;
            mandje.put(productName, price);
        }else{
            throw new KredietLimietException("Not enough credit for this purchase");
        }
    }

    public HashMap<String, Double> getMandje() {
        return mandje;
    }

    public double getKrediet() {
        return krediet;
    }
}