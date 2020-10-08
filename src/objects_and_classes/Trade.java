package objects_and_classes;

import java.time.LocalDateTime;

public abstract class Trade{

    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDateTime dateTime = LocalDateTime.now();


    //      CONSTRUCTOR 1
    public Trade(){
    }

    //      CONSTRUCTOR 2
    public Trade(String id, String symbol, int qty, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = qty;
        this.price = price;
    }

    //      CONSTRUCTOR 3
    public Trade(String id, String symbol, int qty){
        this.id = id;
        this.symbol = symbol;
        this.quantity = qty;
    }

    public void setPrice(double price){
        if(price<0) return;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue(){
        return quantity * price;
    }

    public abstract Double calcDividend() ;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString(){
        return (  "id="  +   id  +   ", symbol="     +  symbol  +  ", qty=" +quantity+", price="+price);
    }

    public static void main(String[] args){

    }
}

