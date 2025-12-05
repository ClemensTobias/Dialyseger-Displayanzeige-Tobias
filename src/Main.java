import javax.swing.JLabel;

import Userinterface.Display;

import CalculationLogic.CheckArterialPressureValues;
import CalculationLogic.CheckDialysateLevel;
import CalculationLogic.CheckDialysateTemperature;
import CalculationLogic.CheckVenousPressureValues;

public class Main{

    public static void main(String[] args) {

        JLabel arterialPressure = Display.createLabel(() -> CheckArterialPressureValues.checkArterialPressure(),
         "Arterieller Druck", "in mmHg", 10, 50);

        JLabel venousPressure = Display.createLabel(() -> CheckVenousPressureValues.checkVenousPressure(),
         "Venöser Druck", "in mmHg", 990, 50);

        JLabel dialysateLevel = Display.createLabel(() -> CheckDialysateLevel.checkDialysateLevel(),
         "Dialysat füllhöhe", "in l", 10, 200);

         JLabel dialysatetemperature = Display.createLabel(() -> CheckDialysateTemperature.checkDialysateTemperature(),
         "Dialysat Temperatur", "in °C", 990, 200);


        JLabel ufCurrent = Display.createLabel(() -> CheckDialysateLevel.increaseByFlowRate(),
         "UF Aktuell", "in L", 250, 50);

          JLabel ufRate = Display.createLabel(() -> CheckDialysateLevel.flowRate,
         "UF Ziel", "in L/m", 500, 50);

         JLabel ufGoal = Display.createLabel(() -> CheckDialysateLevel.ufGoal,
         "UF Ziel", "in L", 750, 50);




        JLabel timer = Display.createLabel(() -> Display.updateTime(),
         "Verbleibende Zeit", "in hh:mm:ss", 475, 300);


        Display display = new Display();
        display.createFrame(arterialPressure, venousPressure, timer, dialysateLevel, dialysatetemperature, ufCurrent, ufRate, ufGoal);

    }
}