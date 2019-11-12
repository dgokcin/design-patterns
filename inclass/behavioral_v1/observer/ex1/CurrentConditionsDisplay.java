package behavioral.observer.ex1;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay() {

    }

    public CurrentConditionsDisplay(WeatherData wd) {
        temperature = wd.getTemperature();
        humidity = wd.getHumidity();
        wd.registerObserver(this);
    }

    public void update(WeatherData data) {
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        display();
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay");
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
        System.out.println();

    }
}
