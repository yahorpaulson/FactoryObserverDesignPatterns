package at.omi.blatt6.a4.sensor.example.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class SomeSensor implements IObservable{

	private long currentValue;
	private ArrayList<IObserver> allObservers;

	public SomeSensor() {
		allObservers = new ArrayList<IObserver>();
		System.out.println("Initializing sensor...");
		currentValue = -1;
		Thread t = new Thread(new ValueGenerator());
		t.start();
	}

	@Override
	public void add(IObserver o) {
		this.allObservers.add(o);
	}

	@Override
	public void remove(IObserver o) {
		this.allObservers.remove(o);

	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : allObservers){
			observer.update();
		}
	}


	// simulate dynamic change of sensor values
	private class ValueGenerator implements Runnable {

		@Override
		public void run() {
			while (true) {
				setCurrentValue(new Random().nextLong());
				System.out.println("SENSOR - �ndere Wert auf: "+getCurrentValue());

				long timeToSleep = new Random().nextInt(12);
				try {
					Thread.sleep(timeToSleep * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	public long getCurrentValue() {
		return currentValue;
	}

	private void setCurrentValue(long currentValue) {
		this.currentValue = currentValue;
		this.notifyObserver();
	}

}
