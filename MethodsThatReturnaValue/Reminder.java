

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Reminder {
	long StartTime, currentTtime,timeDiff;
	String Hemlock="";
	boolean bean=false;
	
	
	
	public void remind(){
		StartTime=System.currentTimeMillis();
		
		if(StartTime==20000){}
	    Hemlock=JOptionPane.showInputDialog("What is your answer you have 45 seconds");
	    
	    currentTtime=System.currentTimeMillis();
	    timeDiff=(currentTtime-StartTime);
	    if (timeDiff>45000){Hemlock="loss";}
	}
		
		
		public String Getanswer1(){	
			return Hemlock;}
		
		
	}
	
	
