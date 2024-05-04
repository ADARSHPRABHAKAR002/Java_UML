package threads;

import java.util.Timer;
import java.util.TimerTask;

class OneTimeTask extends TimerTask {
  
    public void run() {
        System.out.println("One-time task executed");
    }
}

class PeriodicTask extends TimerTask {
    private int count = 0;
    private final int MAX_COUNT = 4;

    public void run() {
        count++;
        System.out.println("Periodic task executed " + count + " time(s)");
        if (count >= MAX_COUNT) {
            cancel(); 
        }
    }
}

public class PeriodicTest {
    public static void main(String[] args) {
        Timer timer = new Timer();

        
        timer.schedule(new OneTimeTask(), 8000);

        // Schedule the periodic task to repeat 4 times, with a delay of 3 seconds between each execution
        timer.schedule(new PeriodicTask(), 8000, 3000);
    }
}

