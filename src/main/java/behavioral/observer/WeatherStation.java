package behavioral.observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        StatisticDisplay statisticsDisplay = new StatisticDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();


        // register observers
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(phoneDisplay);

        System.out.println("1st update");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-----------------------");
        System.out.println("2nd update");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("-----------------------");
        System.out.println("3rd update");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

