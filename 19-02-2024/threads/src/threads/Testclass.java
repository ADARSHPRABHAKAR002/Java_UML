package threads;
import java.util.*;

public class Testclass {
	    public static void main(String[] args) {
	    	
	        Generator generator = new Generator();
	    
	        Thread producerThread = new Thread(new Producer(generator));
	        Thread consumerThread = new Thread(new Consumer(generator));

	        
       
	        producerThread.start();
	        
	        consumerThread.start();
	        
	    }
}
