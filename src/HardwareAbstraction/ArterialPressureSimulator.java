package hardwareabstraction;


public class ArterialPressureSimulator {

    /**
     * a very bare bones implementation of a pressure simulator lacking any kind of realism. However since this 
     * is about making hardware abstraction as simple as possible, this will have to suffice
     * 
     * The simulation will be designed more accurately as soon as there is need to simulate more realistically
     * 
     *
     * @return
     */
    public static String generateRandomArterialPressure() {

        int min = -700;
        int max = 750;

        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;

        String arterialPressure = String.valueOf(randomNumber);

        return arterialPressure;
    }
}
    