package org.factorypattern;

public class Main {


    public static void main(String [] args){

        System.out.println("Factor Pattern ");

        Vehicle carObj = new VehicleFactory().getVehicle("Car");
        Vehicle cycleObj = (Cycle) new VehicleFactory().getVehicle("Cycle");

        boolean hasEngine = carObj.hasEngine();
    }




}
