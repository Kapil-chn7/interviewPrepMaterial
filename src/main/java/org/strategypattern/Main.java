package org.strategypattern;

public class Main {

    public static void main(String []args){
        System.out.println("Strategy Pattern");

        StrategyDecider creditCardStrategy  = new StrategyDecider(new CreditCardStrategy("Credit Card"));

        creditCardStrategy.pay();

        StrategyDecider upiStrategy  = new StrategyDecider(new UpiStrategy("Upi"));

        upiStrategy.pay();




    }
}
