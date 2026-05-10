package org.factorypattern;

public class VehicleFactory {



    public Vehicle getVehicle(String type){


        System.out.println("Vehicle type os : " + type);

        if(type.equals("Car")){
            return new Car();
        }
        else{
            return new Cycle();
        }

    }
}
