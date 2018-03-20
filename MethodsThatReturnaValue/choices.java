import javax.swing.JOptionPane;

public class choices {
	String answers="";
	String answers22="";
	String playagain="";
	public void askLorR(){
		answers=JOptionPane.showInputDialog("left or right");
	}
	public String Getanswer(){	
		return answers;
	}
	public void askkillorrun(){
		answers22=JOptionPane.showInputDialog("kill or run");
	}
	
	public String Getanswers(){	
		return answers22;}
		public void askplayagain(){
			playagain=JOptionPane.showInputDialog("would you like to play again[yes] or [no]");
		}
			public String Getagain(){	
				return playagain;
}}
	
	
