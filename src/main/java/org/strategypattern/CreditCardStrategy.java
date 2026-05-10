package org.strategypattern;

public class CreditCardStrategy implements PayStrategy{

    private final String message;
    public CreditCardStrategy(String message){
        this.message = message;
    }

    @Override
    public void pay(){
        System.out.println("Paying using: "+message);
    }
}
