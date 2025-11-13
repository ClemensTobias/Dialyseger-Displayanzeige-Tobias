import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;


public class Display extends JFrame implements ActionListener{

    static boolean state = false;
    static LocalTime remainingTime = LocalTime.of(0, 3,0);

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
    public void createFrame(JLabel label, JLabel label2, JLabel label3){

        JFrame display = new JFrame();

        display.setTitle("Dialysegerät Display");
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setSize(800,800);
        display.setLayout(null);

        display.setVisible(true);

        display.add(label);
        display.add(label2);
        display.add(label3);

        startStopButton = new JButton();
        startStopButton.setBounds(325, 405, 100, 50);
        startStopButton.setText("start");
        startStopButton.addActionListener(this);

        addRemainingTimeButton = new JButton();
        addRemainingTimeButton.setBounds(480, 300, 50, 100);
        addRemainingTimeButton.setText("+");
        addRemainingTimeButton.addActionListener(this);

        decreaseRemainingTimeButton = new JButton();
        decreaseRemainingTimeButton.setBounds(220, 300, 50, 100);
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
    public static JLabel createLabel(Supplier<String> valueSupplier, String title, String unit, int xCoordinate, int yCoordinate){

        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK, 2);

        label.setBorder(border);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); 
        
    label.setText("<html><div style='text-align:center;'>"
                  + "<span style='font-size:12px;'>" + title + "</span><br>"
                  + "<span style='font-size:12px;'>" + unit + "</span><br>"
                  + "<span style='font-size:24px;'>---</span>"
                  + "</div></html>");


        label.setBounds(xCoordinate, yCoordinate, 200, 100); 
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        Timer timer = new Timer(1000, e -> {
            if(state == true) {
            label.setText("<html><div style='text-align:center;'>"
                          + "<span style='font-size:12px;'>" + title + "</span><br>"
                          + "<span style='font-size:12px;'>" + unit + "</span><br>"
                          + "<span style='font-size:24px;'>" + valueSupplier.get() + "</span>"
                          + "</div></html>");
            }
        });

            timer.start();

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
            TimerButton.increaseTimeRemaining();
        }

        if(e.getSource()==decreaseRemainingTimeButton) {
            TimerButton.decreaseTimeRemaining();
        }

        if(e.getSource()==startStopButton) {
            StartStopButton.changeState();
        }

    }


}