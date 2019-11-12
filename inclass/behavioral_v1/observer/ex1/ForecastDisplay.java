package behavioral.observer.ex1;

public class ForecastDisplay implements Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay() {

    }

    public ForecastDisplay(WeatherData wd) {
        lastPressure = currentPressure;
        currentPressure = wd.getPressure();
        wd.registerObserver(this);
    }


    public void update(WeatherData data) {
        lastPressure = currentPressure;
        currentPressure = data.getPressure();

        display();
    }

    public void display() {
        System.out.println("ForecastDisplay");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
        System.out.println();

    }
}
