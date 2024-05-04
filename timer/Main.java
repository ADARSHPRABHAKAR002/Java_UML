package timer;
import java.util.*;
public class Main extends TimerTask{

	int count=0;
	
	public void run()
	{
		count++;
		System.out.println("i am in run method");
		if(count==4)
			cancel();
	}
	public static void main(String[] args){
		
		
		Main mn=new Main();
		Timer time=new Timer();
		
		time.scheduleAtFixedRate (mn,1000,5000);
		// TODO Auto-generated method stub

	}

}
