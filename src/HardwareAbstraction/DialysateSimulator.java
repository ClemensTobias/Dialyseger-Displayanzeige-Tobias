package Hardwareabstraction;

import java.time.LocalTime;

import Userinterface.Display;

public class DialysateSimulator {

    static int temperature = 38;

 public static String simulateTemperature() {


        
        if (Display.remainingTime == LocalTime.of(0,2,30)) {

            
            int delta = Math.random() < 0.5 ? -1 : 1;

            temperature += delta;

    
        }

        return String.valueOf(temperature);
    }

    
}
