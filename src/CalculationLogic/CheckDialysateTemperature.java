package CalculationLogic;

import Hardwareabstraction.DialysateSimulator;

public class CheckDialysateTemperature {

    static int min = 37;
    static int max = 40;
    static boolean dialysateTempertureWarning = false;

    public static String checkDialysateTemperature(){

        int temperature = Integer.parseInt(DialysateSimulator.simulateTemperature());

        String temperatureString = String.valueOf(temperature);

        if(temperature > max) {
            dialysateTempertureWarning = true;
        } else if (temperature < min) {
            dialysateTempertureWarning = true;
        } else {
            dialysateTempertureWarning = false;
        }

        return temperatureString;
    }
    
}
