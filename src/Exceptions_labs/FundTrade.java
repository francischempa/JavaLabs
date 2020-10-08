package Exceptions_labs;

import objects_and_classes.Trade;

public class FundTrade extends Trade {
    private Double percentage;
    private Double dividend;

    public FundTrade(Double percentage){
        this.percentage = percentage;
    }

    @Override
    public Double calcDividend() {
        return percentage*dividend;
    }
}
