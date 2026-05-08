package org.builderpattern;

import lombok.Builder;
import lombok.Data;

@Data
public class Demo {
    private int id;
    private String message;
    private Demo(Builder builder){
        this.id = builder.id;
        this.message= builder.message;
    }


    public static class Builder{
        public int id;
        public String message;

        public Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder setMessage(String message){
            this.message = message;
            return this;
        }

       public Demo build(){
           return new Demo(this);
       }
    }

}
