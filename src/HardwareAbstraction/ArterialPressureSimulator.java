package Hardwareabstraction;

public class ArterialPressureSimulator {

    private final static int[] arterialPressureValues = new int[10];
    private static int index = 0;
    private static int count = 0;

    public static String generateRandomArterialPressure() {
        int min = -700;
        int max = 750;

        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
        addArterialPressureValue(randomNumber);

        String arterialPressureString = String.valueOf(randomNumber);

        return arterialPressureString;
    }

    private static void addArterialPressureValue(int value) {
        arterialPressureValues[index] = value;
        index = (index + 1) % arterialPressureValues.length;

        if (count < arterialPressureValues.length) {
            count++;
        }
    }


    public static int[] getLastValues() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = arterialPressureValues[(index + i) % arterialPressureValues.length];
        }
        return result;
    }
}

    