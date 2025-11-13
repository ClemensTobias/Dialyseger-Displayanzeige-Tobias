public class StartStopButton{

    /**
     * changes the state of the display whenever the button is pressed. Depending
     * on the current state the button text is changed to match the current state
     * 
     */
    public static void changeState() {

        if(Display.state == false) {
            Display.state = true;
            Display.startStopButton.setText("stop");
        } else {
            Display.state = false;
            Display.startStopButton.setText("start");
        }

    }
}