import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;



public class Main {
	public static void main(String[] args){
		choices choice = new choices();
		StoryBord story = new StoryBord();
		Reminder timer = new Reminder();
		boolean wentleft =false;
		boolean wentright =false;
		boolean sword =false;
		boolean againn=true;	
	
		while (againn){
			sword=false;
			story.Start();
			choice.askLorR();
		if(choice.Getanswer().equalsIgnoreCase("left"))
		{ wentright=false; wentleft=true;						story.statue();choice.askLorR();//left
		}else{
			wentleft=false;wentright=true;						story.tunnel();choice.askLorR();}//right
		
		
		if(wentleft){ //statue
			if(choice.Getanswer().equalsIgnoreCase("left"))
			{ wentright=false; wentleft=true;						story.leave();choice.askLorR();//left
			}else{
				wentleft=false;wentright=true;						story.sneak();choice.askLorR();}//right
			
		}
		
		if(wentright){
			if(choice.Getanswer().equalsIgnoreCase("left"))
			{ wentright=false; wentleft=true;						story.wizzard();choice.askLorR();//left
			}else{
				wentleft=false;wentright=true;						story.warrior();story.choice.askLorR();}//right
			
		}
		
		
		
		
		
		
		
		
		
		
		if(choice.Getanswer().equalsIgnoreCase("left"))
		{ wentright=false; wentleft=true;						story.visitshrine();//left
		}else{
			wentleft=false;wentright=true;						story.visitcliff();}//right
																						choice.askLorR();
		if(wentright){																		//act 1
		if(choice.Getanswer().equalsIgnoreCase("left"))					//went right
		{			wentright=false; wentleft=true;				story. pathcliff();//left
					
		}else{
																sword=true;//gets sword
			wentleft=false;wentright=true;						story.crawlcliff();}}//right
		
		else if(wentleft){
		if(choice.Getanswer().equalsIgnoreCase("left"))				//went right gets know
		{wentright=false; wentleft=true;						story.normalpath();;//left
		choice.askLorR();
		}else{													
			wentleft=false;wentright=true;						story.blooddoor();}}//right
																					//end of act 1
			
		
		
		story.visittemple();
	
		timer.remind();
		if (timer.Getanswer1().equalsIgnoreCase("loss"))
		{if(sword){story.fightend();}
		if (sword==false){story.loss();}
		}else if(timer.Getanswer1().equalsIgnoreCase("hemlock")){
			story.correctanswer();
		}else
		{
			if(sword){story.fightend();}
			
		}
story.riddleend();
choice.askplayagain();
if(choice.Getagain().equalsIgnoreCase("yes")){againn=true;}	else {System.exit(0);}	
		}
		
		
		
		
	}}


