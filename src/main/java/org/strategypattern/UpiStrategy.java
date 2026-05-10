package org.strategypattern;

public class UpiStrategy implements PayStrategy{

    private final String message;

    UpiStrategy(String message){
        this.message = message;
    }

    @Override
    public void pay() {
        System.out.println("Paid using:" +message);
    }
}
