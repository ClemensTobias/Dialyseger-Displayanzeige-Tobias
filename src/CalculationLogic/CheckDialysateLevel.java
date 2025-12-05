package CalculationLogic;

public class CheckDialysateLevel {

    static int min = 2;
    static int max = 10;

    static int level = 8;
    static int flowRate = 1;
    static boolean dialysateLevelWarning = false;

    public static void reduceByFlowRate() {
        

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


    
}
