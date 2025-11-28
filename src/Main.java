import javax.swing.JLabel;

public class Main{

    public static void main(String[] args) {

        JLabel arterialPressure = Display.createLabel(() -> ArterialPressureSimulator.generateRandomArterialPressure(),
         "Arterieller Druck", "in mmHg", 10, 50);

        JLabel venousPressure = Display.createLabel(() -> VenousPressureSimulator.generateRandomArterialPressure(),
         "Venöser Druck", "in mmHg", 570, 50);

        JLabel timer = Display.createLabel(() -> Display.updateTime(),
         "Verbleibende Zeit", "in hh:mm:ss", 275, 300);


        Display display = new Display();
        display.createFrame(arterialPressure, venousPressure, timer);

    }
}