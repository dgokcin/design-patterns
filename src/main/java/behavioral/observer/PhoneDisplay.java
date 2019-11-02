package behavioral.observer;

public class PhoneDisplay implements Observer{
    @Override
    public void update(WeatherData data) {
        System.out.println("PhoneDisplay: " + data.toString());
    }
}
