import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

    float temperature;
    float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerSubscriber(this);
    }
    public void propertyChange(PropertyChangeEvent evt) {

        switch(evt.getPropertyName()) {
            case "temperature":
                temperature = ((float) evt.getNewValue());
                break;
            
            case "humidity":
                humidity = ((float) evt.getNewValue());
                break;
            
            default:
                // Do nothing
        }
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");

    }
}