import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;
    private PropertyChangeSupport support;

    public WeatherData() {
        support = new PropertyChangeSupport(this);
    }

    public void registerSubscriber(PropertyChangeListener pcl) { 
        support.addPropertyChangeListener(pcl);
    }

    public void removeSubscriber(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setTemperature(float temperature) {
        support.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        support.firePropertyChange("humidity", this.humidity, humidity);
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        support.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
    }
}