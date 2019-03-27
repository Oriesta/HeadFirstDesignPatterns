import java.util.Observer;
import java.util.Observable;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            tempSum += weatherData.getTemperature();
            numReadings++;
    
            if (weatherData.getTemperature() > maxTemp) {
                maxTemp = weatherData.getTemperature();
            }
     
            if (weatherData.getTemperature() < minTemp) {
                minTemp = weatherData.getTemperature();
            }
    
            display();
        }

    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }
}
