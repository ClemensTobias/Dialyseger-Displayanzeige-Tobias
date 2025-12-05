package Hardwareabstraction;

public class DialysateSimulator {

    static int temperature = 38;

 public static String simulateTemperature() {

        long now = System.currentTimeMillis();
        long lastChangeTime = System.currentTimeMillis();

        
        if (now - lastChangeTime >= 30_000) {

            
            int delta = Math.random() < 0.5 ? -1 : 1;

            temperature += delta;

            
            lastChangeTime = now;
        }

        return String.valueOf(temperature);
    }

    
}
