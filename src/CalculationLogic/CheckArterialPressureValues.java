package CalculationLogic;

import Hardwareabstraction.ArterialPressureSimulator;

public class CheckArterialPressureValues{

    static int min = -200;
    static int max =  200;
    static boolean arterialPressureWarning = false;

public static String checkArterialPressure() {

    String arterialPressure = ArterialPressureSimulator.generateRandomArterialPressure();

    int pressureValue = Integer.parseInt(arterialPressure);

    if (pressureValue >= max) {
        arterialPressureWarning = true;
    } else if (pressureValue <= min) {
        arterialPressureWarning = true;
    } else {
        arterialPressureWarning = false;
    }

    return arterialPressure;
}

    
}