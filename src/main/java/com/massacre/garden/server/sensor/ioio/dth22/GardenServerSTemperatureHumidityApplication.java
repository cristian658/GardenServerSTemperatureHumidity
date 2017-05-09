package com.massacre.garden.server.sensor.ioio.dth22;

import ioio.lib.util.IOIOLooper;
import ioio.lib.util.pc.IOIOConsoleApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GardenServerSTemperatureHumidityApplication extends IOIOConsoleApp {

	public static void main(String[] args) {
		SpringApplication.run(GardenServerSTemperatureHumidityApplication.class, args);
	}

    @Override
    protected void run(String[] strings) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IOIOLooper createIOIOLooper(String string, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
