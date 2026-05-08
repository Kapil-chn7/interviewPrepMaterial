package org.singletonpattern;


import lombok.Data;

@Data
public class SingletonClass {

    private static SingletonClass singletonClassObj;
    private int id;
    private  String message;

    private SingletonClass(){

    }

    public static SingletonClass getSingletonClassObj(){
        if(singletonClassObj==null){
            singletonClassObj = new SingletonClass();
            singletonClassObj.setId(1);
            singletonClassObj.setMessage("Singleton obj message");

        }
        return singletonClassObj;
    }
}
