

public class WeatherStation {
    public static void main(String[] args) {

        /* Weather data will be published to the displays */
        WeatherData weatherData = new WeatherData();

        /* Displays will subscribe to the weather data publisher */
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        
        //Test Cases:
        weatherData.setTemperature(80);
        weatherData.setHumidity(27);
        weatherData.setPressure(10);
        weatherData.setTemperature(89);
        weatherData.setHumidity(40);
        weatherData.setPressure(20);
        weatherData.setTemperature(47);
        weatherData.setHumidity(25);
        weatherData.setPressure(20);  // This test case failed because the weather forecast cannot report "More of the same"
        weatherData.setTemperature(72);
        weatherData.setHumidity(0);
        weatherData.setPressure(70);

    }
}