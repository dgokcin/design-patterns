package behavioral.observer.ex1;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();


        // register observers
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(phoneDisplay);

        System.out.println("1st update");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-----------------------");
        System.out.println("2nd update");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("-----------------------");
        weatherData.removeObserver(currentDisplay); // remove an observer
        System.out.println("3rd update");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
