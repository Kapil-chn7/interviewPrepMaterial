package org.builderpattern;

public class Main {
    public static void main(String []args){
        System.out.println("Builder Implementation");
        Demo obj1 = new Demo.Builder().setId(1).build();
        Demo obj2 = new Demo.Builder().setId(2).setMessage("Inside builder implementation").build();

        System.out.println(obj1 +" "+obj2);

    }
}
