package behavioral.observer.ex1;

public class StatisticsDisplay implements Observer {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    public StatisticsDisplay() {

    }

    public StatisticsDisplay(WeatherData wd) {
        float t = wd.getTemperature();
        minTemp = t;
        maxTemp = t;
        tempSum += t;
        numReadings++;
        wd.registerObserver(this);

    }

    public void update(WeatherData data) {
        float temp = data.getTemperature();
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("StatisticsDisplay");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
        System.out.println();

    }
}
