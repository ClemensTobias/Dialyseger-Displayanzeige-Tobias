public class TimerButton{

/**
 * increses the remaining time by 30s
 */
public static void increaseTimeRemaining() {

    Display.remainingTime = Display.remainingTime.plusSeconds(30);

}

/**
 * Decreses the remaining time by 30s
 */
public static void decreaseTimeRemaining(){

    Display.remainingTime = Display.remainingTime.minusSeconds(30);
    
}

}