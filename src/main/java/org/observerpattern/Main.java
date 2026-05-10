package org.observerpattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("ObserverPattern");
        Weather chennaiLocation = new ChennaiWeather("Chennai" );
        Weather delhiLocation = new DelhiWeather( "Delhi");

        WeatherStation station = new WeatherStation();
        station.addSubject(chennaiLocation);
        station.addSubject(delhiLocation);
        station.updateTemperature(40);

    }
}
