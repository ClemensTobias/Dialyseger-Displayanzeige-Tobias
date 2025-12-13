
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

       LabelConfigPojo arterialPressurePojo = new LabelConfigPojo(() -> CheckArterialPressureValues.updateArterialPressure(),
"Arterieller Druck",
        "in mmHg",
        10,
        50,
        "Field"
);

LabelConfigPojo venousPressurePojo = new LabelConfigPojo(
        () -> CheckVenousPressureValues.checkVenousPressure(),
        "Venöser Druck",
        "in mmHg",
        990,
        50,
        "Field"
);

LabelConfigPojo dialysateLevelPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.checkDialysateLevel(),
        "Dialysat füllhöhe",
        "in l",
        10,
        200,
        "Field"
);

LabelConfigPojo dialysateTemperaturePojo = new LabelConfigPojo(
        () -> CheckDialysateTemperature.checkDialysateTemperature(),
        "Dialysat Temperatur",
        "in °C",
        990,
        200,
        "Field"
);

LabelConfigPojo ufCurrentPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.increaseByFlowRate(),
        "UF Aktuell",
        "in L",
        250,
        50,
        "Field"
);

LabelConfigPojo ufRatePojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.flowRate,
        "UF Ziel",
        "in L/m",
        500,
        50,
        "Field"
);

LabelConfigPojo ufGoalPojo = new LabelConfigPojo(
        () -> CheckDialysateLevel.ufGoal,
        "UF Ziel",
        "in L",
        750,
        50,
        "Field"
);

LabelConfigPojo timerPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Verbleibende Zeit",
        "in hh:mm:ss",
        475,
        300,
        "Field"
);

LabelConfigPojo arterialPressureWarningPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Arterieller Druck Ausßerhalb der erlabuten Grenzen",
        "in hh:mm:ss",
        0,
        800,
        "Warning"
);

LabelConfigPojo venousPressureWarningPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Venöser Druck Ausßerhalb der erlabuten Grenzen",
        "in hh:mm:ss",
        0,
        690,
        "Warning"
);

LabelConfigPojo dialysateLevelWarningPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Geringes Dialysat Level erkannt",
        "in hh:mm:ss",
        0,
        580,
        "Warning"
);

LabelConfigPojo dialysateTemepratureWarningPojo = new LabelConfigPojo(
        () -> Display.updateTime(),
        "Temperatur des Dialysats außerhalb der erlabuten Grenzen",
        "in hh:mm:ss",
        0,
        470,
        "Warning"
);



arterialPressureWarningPojo.setShowSupplier(() -> CheckArterialPressureValues.getArterialPressureWarning());
venousPressureWarningPojo.setShowSupplier(() -> CheckVenousPressureValues.getVenousPressureWarning());
dialysateLevelWarningPojo.setShowSupplier(() -> CheckDialysateLevel.getDialysateLevelWarning());
dialysateTemepratureWarningPojo.setShowSupplier(() -> CheckDialysateTemperature.getDialysateTemperatureWarning());

        

JLabel arterialPressure = Display.createLabel(arterialPressurePojo);
JLabel venousPressure   = Display.createLabel(venousPressurePojo);
JLabel dialysateLevel   = Display.createLabel(dialysateLevelPojo);
JLabel dialysateTemp    = Display.createLabel(dialysateTemperaturePojo);
JLabel ufCurrent        = Display.createLabel(ufCurrentPojo);
JLabel ufRate           = Display.createLabel(ufRatePojo);
JLabel ufGoal           = Display.createLabel(ufGoalPojo);
JLabel timer            = Display.createLabel(timerPojo);

JLabel arterialPressureWarning = Display.createLabel(arterialPressureWarningPojo);
JLabel venousPressureWarning = Display.createLabel(venousPressureWarningPojo);
JLabel dialysateLevelWarning = Display.createLabel(dialysateLevelWarningPojo);
JLabel dialysateTemperatureWarning = Display.createLabel(dialysateTemepratureWarningPojo);

List<JLabel> labels = List.of(
            arterialPressure,
            venousPressure,
            dialysateLevel,
            dialysateTemp,
            ufCurrent,
            ufRate,
            ufGoal,
            timer,
            arterialPressureWarning,
            venousPressureWarning,
            dialysateLevelWarning,
            dialysateTemperatureWarning

    );


    Display display = new Display();
    display.createFrame(labels);


    }
}