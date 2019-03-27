public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    private Subject weatherData;
    float temperature;
    float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        CurrentConditionsDisplay o = this;
        o.weatherData = weatherData;
        weatherData.registerObserver(o);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");

    }
}