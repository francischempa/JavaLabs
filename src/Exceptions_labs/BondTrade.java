package Exceptions_labs;

import objects_and_classes.Trade;

public class BondTrade extends Trade {

    private Double dividend;
    public BondTrade(Double dividend){
        this.dividend = dividend;
    }

    @Override
    public Double calcDividend() {
        return this.dividend;
    }


}
