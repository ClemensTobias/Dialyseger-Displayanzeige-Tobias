package Hardwareabstraction;

public class VenousPressureSimulator {


    private final static int[] venousPressureValues = new int[10];
    private static int index = 0;
    private static int count = 0;
    /**
     * a very bare bones implementation of a pressure simulator lacking any kind of realism. However since this 
     * is about making hardware abstraction as simple as possible, this will have to suffice
     * 
     * The simulation will be designed more accurately as soon as there is need to simulate more realistically
     * 
     *
     * @return
     */    
    public static String generateRandomVenousPressure() {

        int min = -700;
        int max = 750;

        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
        addVenousPressureValue(randomNumber);

        String venousPressure = String.valueOf(randomNumber);

        return venousPressure;
    }

    private static void addVenousPressureValue(int value) {
        venousPressureValues[index] = value;
        index = (index + 1) % venousPressureValues.length;

        if (count < venousPressureValues.length) {
            count++;
        }
    }


    public static int[] getLastValues() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = venousPressureValues[(index + i) % venousPressureValues.length];
        }
        return result;
    }
}