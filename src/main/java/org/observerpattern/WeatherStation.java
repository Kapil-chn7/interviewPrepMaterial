package org.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Weather> weatherList;

    WeatherStation(){
        weatherList = new ArrayList<>();
    }
    public void updateTemperature(int temperature){
         this.temperature=temperature;
         notifySubjects();
    }

    public void addSubject(Weather obj){
        weatherList.add(obj);
    }



    private void notifySubjects(){
        for(Weather weather: weatherList){

           weather.update(temperature);

        }
    }
}
