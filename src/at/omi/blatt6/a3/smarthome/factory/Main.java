package at.omi.blatt6.a3.smarthome.factory;

/**
 * Some quick and dirty test class
 *
 */

public class Main {

	public static void main(String[] args) {

		SmarthomeManager sh = new SmarthomeManagerFactory();
		
		sh.addDevice("4523", "Licht Wohnzimmer", "A1");
		sh.addDevice("hjtq", "Licht Keller", "A2");
		
		sh.addDevice("twet435", "Temperatur innen", "S1");
		sh.addDevice("weat34", "Temperatur aussen", "S1");
		
		
		sh.switchActorsOn();
		try {
			// Wait 5 seconds....
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sh.switchActorsOff();
		sh.printSensorReadings();
		
	}

}
