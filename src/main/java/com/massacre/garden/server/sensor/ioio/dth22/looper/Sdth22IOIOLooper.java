package com.massacre.garden.server.sensor.ioio.dth22.looper;

import ioio.lib.api.PulseInput;
import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;

/**
 *
 * @author cquezada
 */
public class Sdth22IOIOLooper extends BaseIOIOLooper {
    
    private PulseInput _pInput;
    protected void setup() throws ConnectionLostException,
                    InterruptedException {    
               
    }

    @Override
    public void loop() throws ConnectionLostException,
        InterruptedException {
        
        Thread.sleep(500);
    }
}
