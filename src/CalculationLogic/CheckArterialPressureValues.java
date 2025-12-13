package CalculationLogic;

import Hardwareabstraction.ArterialPressureSimulator;

public class CheckArterialPressureValues {

    static int min = -200;
    static int max = 200;

    private static int currentPressure;
    public static Boolean arterialPressureWarning = false;

    public static String updateArterialPressure() {

        currentPressure = Integer.parseInt(
            ArterialPressureSimulator.generateRandomArterialPressure()
        );

            if(currentPressure > max) {
                arterialPressureWarning = true;
            } else if (currentPressure < min){
                arterialPressureWarning = false;
            }
                return String.valueOf(currentPressure);
    }

    public static Boolean getArterialPressureWarning() {
        return arterialPressureWarning;
    }
}