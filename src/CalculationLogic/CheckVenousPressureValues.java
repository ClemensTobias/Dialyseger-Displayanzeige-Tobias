package CalculationLogic;

import Hardwareabstraction.VenousPressureSimulator;

public class CheckVenousPressureValues {

    static int min = -200;
    static int max =  200;
    static boolean venousPressureWarning = false;

public static String checkVenousPressure() {

    String venousPressure = VenousPressureSimulator.generateRandomArterialPressure();

    int pressureValue = Integer.parseInt(venousPressure);

    if (pressureValue >= max) {
        venousPressureWarning = true;
    } else if (pressureValue <= min) {
        venousPressureWarning = true;
    } else {
        venousPressureWarning =false;
    }

    return venousPressure;
}

    public static Boolean getVenousPressureWarning() {
        return venousPressureWarning;
    }
    
}
