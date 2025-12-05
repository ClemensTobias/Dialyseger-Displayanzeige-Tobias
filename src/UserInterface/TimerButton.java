package Userinterface;



public class TimerButton{

/**
 * increses the remaining time by 30s
 */
public static void addTime() {

    Display.remainingTime = Display.remainingTime.plusSeconds(30);

}

/**
 * Decreses the remaining time by 30s
 */
public static void decreaseTime(){

    Display.remainingTime = Display.remainingTime.minusSeconds(30);
    
}

}