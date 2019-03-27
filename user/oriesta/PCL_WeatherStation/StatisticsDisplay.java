import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(WeatherData weatherData) {
		weatherData.registerSubscriber(this);
	}

	public void propertyChange(PropertyChangeEvent evt) {

		if ("temperature" == evt.getPropertyName()) {

			float temp = (float) evt.getNewValue();
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
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
