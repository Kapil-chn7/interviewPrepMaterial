package org.observerpattern;

public class DelhiWeather implements Weather{
    private final String location;



    public DelhiWeather(String location) {

        this.location = location;
    }


    @Override
    public void update(int temperature) {
        String message= "Observer is from this "+location+" : and the updated values are "+temperature;
        System.out.println(message);
    }
}
