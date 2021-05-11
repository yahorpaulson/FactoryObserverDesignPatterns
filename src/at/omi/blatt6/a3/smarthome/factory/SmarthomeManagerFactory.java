package at.omi.blatt6.a3.smarthome.factory;

import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

public class SmarthomeManagerFactory extends  SmarthomeManager{

    @Override
    public Device createDevice(String id, String name, String model){
        Device tempDevice=null;

        if(model.equals("A1")){
            tempDevice = new SimulatedLight1Adapter();
        }
        else if(model.equals("A2")){
            tempDevice = new SimulatedLight2Adapter();
        }
        else if(model.equals("S1")){
            tempDevice = new SensorImpl();
            ((Sensor)tempDevice).setUnit("SomeUnit");
        }

        return tempDevice;
    }
}
