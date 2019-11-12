package behavioral.observer.ex1;

public class PhoneDisplay implements Observer {
    @Override
    public void update(WeatherData data) {
        System.out.println("PhoneDisplay " + data.toString());
    }
}
