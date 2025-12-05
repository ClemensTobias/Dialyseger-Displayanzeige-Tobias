import javax.swing.JLabel;

import CalculationLogic.CheckArterialPressureValues;
import CalculationLogic.CheckDialysateLevel;
import CalculationLogic.CheckVenousPressureValues;

public class Main{

    public static void main(String[] args) {

        JLabel arterialPressure = Display.createLabel(() -> CheckArterialPressureValues.checkArterialPressure(),
         "Arterieller Druck", "in mmHg", 10, 50);

        JLabel venousPressure = Display.createLabel(() -> CheckVenousPressureValues.checkVenousPressure(),
         "Venöser Druck", "in mmHg", 570, 50);

        JLabel dialysateLevel = Display.createLabel(() -> CheckDialysateLevel.checkDialysateLevel(),
         "Dialysat füllhöhe", "in l", 570, 150);





        JLabel timer = Display.createLabel(() -> Display.updateTime(),
         "Verbleibende Zeit", "in hh:mm:ss", 275, 300);


        Display display = new Display();
        display.createFrame(arterialPressure, venousPressure, timer, dialysateLevel);

    }
}