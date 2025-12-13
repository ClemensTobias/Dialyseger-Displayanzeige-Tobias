
import java.util.List;

import javax.swing.JLabel;

import Userinterface.Display;
import Userinterface.LabelConfigPojo;
import CalculationLogic.CheckArterialPressureValues;
import CalculationLogic.CheckDialysateLevel;
import CalculationLogic.CheckDialysateTemperature;
import CalculationLogic.CheckVenousPressureValues;


public class Main{

    public static void main(String[] args) {

       LabelConfigPojo arterialPressurePojo = new LabelConfigPojo(() -> CheckArterialPressureValues.checkArterialPressure(),
"Arterieller Druck",
        "in mmHg",
        10,
        50
);

LabelConfigPojo venousPressurePojo = new LabelConfigPojo(
        () -> CheckVenousPressureValues.checkVenousPressure(),
        "Venöser Druck",
        "in mmHg",
        990,
        50
);

LabelConfigPojo dialysateLevelPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.checkDialysateLevel(),
        "Dialysat füllhöhe",
        "in l",
        10,
        200
);

LabelConfigPojo dialysateTemperaturePojo = new LabelConfigPojo(
        () -> CheckDialysateTemperature.checkDialysateTemperature(),
        "Dialysat Temperatur",
        "in °C",
        990,
        200
);

LabelConfigPojo ufCurrentPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.increaseByFlowRate(),
        "UF Aktuell",
        "in L",
        250,
        50
);

LabelConfigPojo ufRatePojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.flowRate,
        "UF Ziel",
        "in L/m",
        500,
        50
);

LabelConfigPojo ufGoalPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.ufGoal,
        "UF Ziel",
        "in L",
        750,
        50
);

LabelConfigPojo timerPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Verbleibende Zeit",
        "in hh:mm:ss",
        475,
        300
);

        

JLabel arterialPressure = Display.createLabel(arterialPressurePojo);
JLabel venousPressure   = Display.createLabel(venousPressurePojo);
JLabel dialysateLevel   = Display.createLabel(dialysateLevelPojo);
JLabel dialysateTemp    = Display.createLabel(dialysateTemperaturePojo);
JLabel ufCurrent        = Display.createLabel(ufCurrentPojo);
JLabel ufRate           = Display.createLabel(ufRatePojo);
JLabel ufGoal           = Display.createLabel(ufGoalPojo);
JLabel timer            = Display.createLabel(timerPojo);

List<JLabel> labels = List.of(
            arterialPressure,
            venousPressure,
            dialysateLevel,
            dialysateTemp,
            ufCurrent,
            ufRate,
            ufGoal,
            timer
    );


    Display display = new Display();
    display.createFrame(labels);


    }
}