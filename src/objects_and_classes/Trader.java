package objects_and_classes;

import java.util.ArrayList;

public class Trader{

    private Account ac = new Account(); ;
    private String name = "";
    private ArrayList<Trade> trades = new ArrayList<>();

    public double getAccountValue(){
        return ac.get();
    }

    public ArrayList<Trade> getTrades() {
        return trades;
    }

    public void addTrade(Trade t){
        trades.add(t);
        ac.set( ac.get() + t.getValue() );
    }

}