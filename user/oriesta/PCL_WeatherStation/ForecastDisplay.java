import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ForecastDisplay implements PropertyChangeListener, DisplayElement {

	private float currentPressure;  
	private float lastPressure;

	public ForecastDisplay(WeatherData weatherData) {
		weatherData.registerSubscriber(this);
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if ("pressure" == evt.getPropertyName()) {
			lastPressure = (float) evt.getOldValue();
			currentPressure = (float) evt.getNewValue();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (lastPressure == 0) {
			System.out.println("Insufficient weather history to predict weather");
		} else if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
