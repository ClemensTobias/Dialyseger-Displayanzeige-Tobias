package CalculationLogic;

import Userinterface.Display;

public class CheckDialysateLevel {

    static int min = 2;
    static int max = 10;

    public static String ufGoal = "20";
    static int ufCurrent = 0;

    static int level = 8;
    public static String flowRate = "1";
    static boolean dialysateLevelWarning = false;

    public static String increaseByFlowRate() {
        Display.secondCounter++;
        
        if (Display.secondCounter % 30 == 0) {

            ufCurrent += 1;

        }

        String ufCurrentString = String.valueOf(ufCurrent);

        return ufCurrentString;

    }

    public static String checkDialysateLevel() {

        String dialysateLevelString = String.valueOf(level);

        if(level < min) {
            dialysateLevelWarning = true;
        } else if(level > max) {
            dialysateLevelWarning = true;
        } else {
            dialysateLevelWarning = false;
        }


        return dialysateLevelString;

    }

        public static Boolean getDialysateLevelWarning() {
        return dialysateLevelWarning;
    }


    
}
