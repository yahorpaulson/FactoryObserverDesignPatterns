package at.omi.blatt6.a4.sensor.example.observer;

public class SomeSensorReader implements IObserver {

	SomeSensor sensor;

	public SomeSensorReader(SomeSensor sensor) {
		this.sensor = sensor;
		System.out.println("Starte Auslesen von Werten...");
	}

	@Override
	public void update() {
		System.out.println("SENSOR READER - Gelesener Sensorwert: " + sensor.getCurrentValue());
	}
}
