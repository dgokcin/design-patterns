package behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Observable {
    List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new LinkedList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    //set ettikten sonra notify i cagirdi
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature; //read from sensors
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "h: " + humidity + " t: " + temperature + " p: " + pressure;
    }


}
