package org.strategypattern;

public class StrategyDecider {

    private final PayStrategy strategy;

    public StrategyDecider(PayStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
       strategy.pay();
    }

}
