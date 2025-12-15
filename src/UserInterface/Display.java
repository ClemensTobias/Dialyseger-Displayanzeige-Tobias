package Userinterface;

import javax.swing.*;
import javax.swing.border.Border;

import CalculationLogic.CheckArterialPressureValues;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Supplier;




public class Display extends JFrame implements ActionListener{

    static boolean state = false;
    public static LocalTime remainingTime = LocalTime.of(0, 3,0);
    public static int secondCounter = 0;

    static JButton addRemainingTimeButton;
    static JButton decreaseRemainingTimeButton;
    static JButton startStopButton;

    /**
     * Creates the frame and adds the labels and buttons that need to be present
     * 
     * I am currently not content with the way buttons are implemented but considering that 
     * the only goal for this sprint is to implement the bare basics this will, at least for now,
     * suffice in my opinion
     * 
     * 
     * @param label 
     * @param label2
     * @param label3
     */
public void createFrame(List<JLabel> labels){

    JFrame display = new JFrame();

    display.setTitle("Dialysegerät Display");
    display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    display.setSize(1220,1200);
    display.setLayout(null);

    // Automatisch alle Labels hinzufügen  
    labels.forEach(display::add);

    ArterialPressureChartPanel chart = new ArterialPressureChartPanel();
    display.add(chart);

    display.setVisible(true);


    startStopButton = new JButton();
    startStopButton.setBounds(525, 405, 100, 50);
    startStopButton.setText("start");
    startStopButton.addActionListener(this);

    addRemainingTimeButton = new JButton();
    addRemainingTimeButton.setBounds(680, 300, 50, 100);
    addRemainingTimeButton.setText("+");
    addRemainingTimeButton.addActionListener(this);

    decreaseRemainingTimeButton = new JButton();
    decreaseRemainingTimeButton.setBounds(420, 300, 50, 100);
    decreaseRemainingTimeButton.setText("-");
    decreaseRemainingTimeButton.addActionListener(this);

    display.add(addRemainingTimeButton);
    display.add(decreaseRemainingTimeButton);
    display.add(startStopButton);
}

/**
 * Creates labels with predetermined sizes which update their content every second.
 * The content is only updated when the stat is true
 * 
 * To more accuretly name the labels html tags are used
 * 
 * @param valueSuplier the values displayed inside the label
 * @param xCoordinate x coordinate inside the frame
 * @param yCoordinate y coordinate inside the frame
 * @return
 */
public static JLabel createLabel(LabelConfigPojo config){

    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK, 2);

    label.setBorder(border);
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); 

    if(config.getType().equals("Field")) {

    label.setText("<html><div style='text-align:center;'>"
            + "<span style='font-size:12px;'>" + config.getTitle() + "</span><br>"
            + "<span style='font-size:12px;'>" + config.getUnit() + "</span><br>"
            + "<span style='font-size:24px;'>---</span>"
            + "</div></html>");

    label.setBounds(config.getX(), config.getY(), 200, 100);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setVerticalAlignment(SwingConstants.CENTER);

    Timer timer = new Timer(1000, e -> {
        
        if (state) {
            label.setText("<html><div style='text-align:center;'>"
                    + "<span style='font-size:12px;'>" + config.getTitle() + "</span><br>"
                    + "<span style='font-size:12px;'>" + config.getUnit() + "</span><br>"
                    + "<span style='font-size:24px;'>" + config.getValueSupplier().get() + "</span>"
                    + "</div></html>");


        }
    });

    timer.start();

} else if(config.getType().equals("Warning")){

    label.setText(config.getTitle());
    label.setBounds(config.getX(), config.getY(), 1210, 100);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setVerticalAlignment(SwingConstants.CENTER);

    label.setVisible(false);

    Timer timer2 = new Timer(1000, e -> {
        
        Boolean show = config.getShowSupplier().get();
        label.setVisible(show);

    });

    timer2.start();
}

    return label;
}

    /**
     * foramtes the time to hh:mm:ss and subtracts 1s from the reamining time
     * @return
     */
    public static String updateTime(){

        DateTimeFormatter hourMinuteSeconds = DateTimeFormatter.ofPattern("HH:mm:ss");
        remainingTime = remainingTime.minusSeconds(1);

        return String.valueOf(hourMinuteSeconds.format(remainingTime));
    }

/**
 * Whenever a button is pressed the corresponding function is called
 * @param e button pressed event
 */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addRemainingTimeButton) {
            TimerButton.addTime();
        }

        if(e.getSource()==decreaseRemainingTimeButton) {
            TimerButton.decreaseTime();
        }

        if(e.getSource()==startStopButton) {
            StartStopButton.startStop();
        }

    }


}