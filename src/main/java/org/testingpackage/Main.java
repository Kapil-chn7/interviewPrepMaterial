package org.testingpackage;

import org.builderpattern.Demo;

public class Main {

    public static void main(String [] args){
        System.out.println("Testing");
        Demo obj = new Demo.Builder().setId(3).setMessage("Testing").build();
        System.out.println(obj);

    }

}
