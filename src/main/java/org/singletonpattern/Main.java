package org.singletonpattern;

public class Main {
    public static void main(String []args){
        System.out.println("Singleton Implementation");

        SingletonClass obj = SingletonClass.getSingletonClassObj();
        System.out.println("Output is: "+obj.getMessage()+" id is: "+ obj.getId());

    }
}
