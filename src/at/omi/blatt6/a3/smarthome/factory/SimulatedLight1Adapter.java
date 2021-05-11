package at.omi.blatt6.a3.smarthome.factory;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation1.SimulatedLight1;

public class SimulatedLight1Adapter extends SimulatedLight1 implements Actor{
	
	private String id;
	
	private String name;
	
	private boolean on;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void switchOn(){
		this.on = true;
		this.sendCommand("CONTROL;STATUS;ON");
	}

	public void switchOff(){
		this.on = false;
		sendCommand("CONTROL;STATUS;OFF");
	}
	
	public boolean isOn(){
		return this.on;
	}
}
