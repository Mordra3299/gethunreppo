import javax.swing.JOptionPane;

public class StoryBord {
	Reminder timer = new Reminder();

	public void Start() {

		JOptionPane.showMessageDialog(null,
				"This is a D&D tryout\nYou Wake up in"
						+ " a cave it smells of mold and evil\n your head throbs flashbacks"
						+ " occour, a festival, your sisters smile, demons breaking through.\n And curosive curroptive mist that turned animals to ash and plants to dirt\n"
						+ " You remember the earth opening up underneath you \n and the cry of your sister as she plumets down ahead of you"
						+ " Your sister is nowhere in sight just a large purple flower\n"
						+ " attempting to get up your attacked by this flower it forces its way into your mouth\n"
						+ "it tastes of rotting meat its fumes toxic and painful\n"
						+ "your eyes water you might pass out\n" + "but not yet not untill you find your sister\n"
						+ "you have no idea what that flower was but whatever it was its inside you now"
						+ "\nn now for the choice a cave with two exits the way above crashed in and the body of the less fortunate crushed beside you\n"
						+ "do you go left or right.");
	}

	public void visitshrine() {
		JOptionPane.showMessageDialog(null,
				"you notice a torch and decide to grab it. you limp out through the left hallway it goes on forever and you get the sinking suspition your going further down\n"
						+ "you do however spot traces of blood it smells tasty. \n you ment gross like the smell of nickle and dispare.\n"
						+ "you eventually come to a shine the statue on the allter depicts a dryad a mychical creature possesing protective\n"
						+ "magic. the wooden spike shes holding close to her chest though brings back some old memory. its hard to remember \n"
						+ "but you know its nothing good.\n"
						+ "shes pointing to the door on the right it seems like a bad idea\n"
						+ "but the blood you tracked is going through that door as well\n"
						+ "so adventurer the door on the left or the door on the right.");
	}

	public void visitcliff() {
		JOptionPane.showMessageDialog(null,
				"you notice a torch and decide to grab it.you limp into the right corridor and are immediatly faced with a cliff\n"
						+ "you notice a ledge\n"
						+ "stupid idea really but you think you might be able to scale that ledge to get to a cave across the way\n"
						+ "you see something glittering maybe a wepon or even better some clue to where you are and where your sister is. \n"
						+ "that ledge is to your right you could always just keep going left.");
	}

	public void pathcliff() {
		JOptionPane.showMessageDialog(null,
				"you choose not to crawl along that cliff and continue confidently forth the tunnel is long and you are tired");
	}

	public void crawlcliff() {
		JOptionPane.showMessageDialog(null,
				"your crawl along the cliff and find a sword its shining although the knight the sword once belonged to is dirty and rusted\n"
						+ "hopefully this will come in handy the cliff opens up into a corridor and you diside to continue however as you take your first step the sword burns in your hand\n"
						+ "it sparks to life and feels red hot and something deep inside you hates it. you find that as long as you dont directly touch it your fine and you continue with \n"
						+ "your cursed sword");
	}

	public void blooddoor() {
		JOptionPane.showMessageDialog(null,
				"you find your way intpo the bloody door a table covered with instruments both sharp and dull cover the table\n"
						+ "the smell is horrible whover was tortured her you feel bad for you just hope its not your sister");
	}

	public void normalpath() {
		JOptionPane.showMessageDialog(null,
				"you choose to ignore the idol and follow your gut feeling however as you leave your body rummbles and lurches\n"
						+ "whatever crawled into your stomach is moving now");
	}

	public void visittemple() {
		JOptionPane.showMessageDialog(null, "you come face to face with a large door");
		JOptionPane.showMessageDialog(null, "seeing as there is no other choice you decide to open the door");
		JOptionPane.showMessageDialog(null, "torches on each side light to illuminate a large golden statue \n"
				+ "it also shows your the inscribed tiles on the wall \n"
				+ "the tiles are made to look like two huge snakes whos winding turns are smooth and uniform, designed to match eachother\n"
				+ "the face eachother and in between where there heads are closest lays a barred door in the wall");
		JOptionPane.showMessageDialog(null,
				"you notice a tablet under the statue and go to investigate\n" + "you find a riddle\n"
						+ "it asks what is the item the graces a womens stock and provides her man an end to the talk");
		JOptionPane.showMessageDialog(null,
				"you place your hand on the riddle to clear away the dust and when you do the statues eyes glow\n"
						+ "the snakes tails light up and the light crawls along there bodies twords the head\n"
						+ "you feel like you should hurry");

	}

	public void loss() {
		JOptionPane.showMessageDialog(null,
				"The serpents light race twords eachother you shout outyour answer"
						+ "\nbut its too late by the time your words leave your mouch the light is withen the serpants fangs\n"
						+ "the trap door between the serpants head begains to rumble and shake you watch in cold horor as the\n"
						+ "trap door slowly opens");
		JOptionPane.showMessageDialog(null,
				"the first thing you see is black tattered wings dart out underneath the door\n"
						+ "pushing agains it like it might somehow be able to open the heavy stone door faster\n"
						+ "then you see the claws scarmbling against the stonework a howl erupts");
		JOptionPane.showMessageDialog(null, "time to get out. You start to run for the door screw this you might be\n"
				+ "able to find another way out");
		JOptionPane.showMessageDialog(null,
				"thats when you hear it\n" + "it snaps like a bullet by your ear a black showdow invelops you");
		JOptionPane.showMessageDialog(null, "you fall and crawl away finally seeing your agressor\n"
				+ "it almost looks like a hag expect the face is not ugly but rather distorted twisted and missing\n"
				+ "a feathered creature with long claws and tatered wings hobbles twords you\n"
				+ "her breath stinks and claws are jagged all the while she leaves a ambriotic jell behind her\n");
		JOptionPane.showMessageDialog(null,
				"the last thing you see is the fangs or your captor and the last thing you feel is and evil\n"
						+ "presence withen laughing  ");
	}

	public void correctanswer() {
		JOptionPane.showMessageDialog(null,
				"you shout outyour answer\n" + "the lights suddenly go dark\n"
						+ "the statue in fron of you starts to glow an eary golden light\n"
						+ "all of a suden the trap door between the serpents heads begains to buck and shake\n"
						+ "its blown off of its hinges\n"
						+ "as soon as it is your head starts to ring and shake you fall unconcious");
		JOptionPane.showMessageDialog(null, "your dreams ore feaverish and weak\n"
				+ "you dream in the boddy of an sperrow flying high above a vally \n"
				+ "you see a mountain and of a tree glowing of healing light\n"
				+ "all seems good till you spot a purple scab upon the lang\n" + "you land and go to peck at it\n"
				+ "as soon as you touch it you have a vision of shade overruning the walls of the vally\n"
				+ "a red haired nomad is standing next to you\n" + "he looks upon you with worry and wonder");
		JOptionPane.showMessageDialog(null,
				"you wake up to  your sisters face\n" + "she says she thought she lost you\n"
						+ "then you notice the sky the trees\n" + "somehow you got out\n"
						+ "startled you bolt upright just in time \n"
						+ "to see a man with red hair walk behind a tree\n"
						+ "you go to investigate but hes not there\n" + "only a note\n" + "welcome hero to Orantius");
	}
	choices choice = new choices();
	
	public void fightend() {
		{
			JOptionPane.showMessageDialog(null,
					"The serpents light race twords eachother you shout outyour answer"
							+ "\nbut its too late by the time your words leave your mouch the light is withen the serpants fangs\n"
							+ "the trap door between the serpants head begains to rumble and shake you watch in cold horor as the\n"
							+ "trap door slowly opens");
			JOptionPane.showMessageDialog(null,
					"the first thing you see is black tattered wings dart out underneath the door\n"
							+ "pushing agains it like it might somehow be able to open the heavy stone door faster\n"
							+ "then you see the claws scarmbling against the stonework a howl erupts");
			JOptionPane.showMessageDialog(null,
					"time to get out. You start to run for the door screw this you might be\n"
							+ "able to find another way out");
			JOptionPane.showMessageDialog(null,
					"thats when you hear it\n" + "it snaps like a bullet by your ear a black showdow invelops you");
			JOptionPane.showMessageDialog(null, "you fall and crawl away finally seeing your agressor\n"
					+ "it almost looks like a hag expect the face is not ugly but rather distorted twisted and missing\n"
					+ "a feathered creature with long claws and tatered wings hobbles twords you\n"
					+ "her breath stinks and claws are jagged all the while she leaves a ambriotic jell behind her\n");
			JOptionPane.showMessageDialog(null,"thats when the sword youve almost forgoten about blares to life in your hand"
					+ "\n in a moment of desperation you lash out tword the creature kinking it the holy light exploading slamming\n"
					+ "the creature against the wall\n"
					+ "you quickly asses the situation do you want to presue her or run");choice.askkillorrun();
					if(choice.Getanswers().equalsIgnoreCase("kill"))
					{JOptionPane.showMessageDialog(null, "you decide to kill it");
					JOptionPane.showMessageDialog(null, "something about that feels increadibly right");
					
					
					}else{JOptionPane.showMessageDialog(null, "you decide to run");
					JOptionPane.showMessageDialog(null, "so what are you doing run!");
					JOptionPane.showMessageDialog(null, "you dont want to run");
					JOptionPane.showMessageDialog(null, "not from anything not anymore");}
					JOptionPane.showMessageDialog(null, "you charge the creature bloodlust consuming you\n"
							+ "the demon inside you writhes in delight as you swing your fist strike\n"
							+ "your creature holds up one hand in a desprate attempt to block your attack\n"
							+ "your attack is deflected but you follow up with a thrust ");
					JOptionPane.showMessageDialog(null, "it strikes true");
					JOptionPane.showMessageDialog(null, "your creature asks you why");
					JOptionPane.showMessageDialog(null, "your bloodlust ends");
					JOptionPane.showMessageDialog(null, "and there in a pool of her own blood lies you sister");
					JOptionPane.showMessageDialog(null, "shame you wernt better at riddles");
		}
	}

	public void riddleend() {JOptionPane.showMessageDialog(null, "THANK YOU FOR PLAYING HERO OF ORANTIUS");
 JOptionPane.showMessageDialog(null, "this is a test game and the first of hopefully many\n"
			+ "again thank you again");
JOptionPane.showMessageDialog(null, "I incorage you to play again there are differnt endings depending on items\n"
		+ "and information you aquire for a total of 3 endings strive to find the riddle and have fun!!");
		
	}

	public void tunnel() {
		JOptionPane.showMessageDialog(null,
				"you exit through a tunnel its damp and low you wonder if youll ever get out\n"
						+ "eventually you see a light at the end of the tunnle a single torch illuminates two pictures \n"
						+ "one on the left of a warrior\n" + "one on the right of a mage\n"
						+ "you notice they look to be buttons and choose to push one\n "
						+ "which one do you push the one on the left or the one on the right.");
	}

	public void warrior() {
		JOptionPane.showMessageDialog(null, "you choose to push the warrior as it sinks in you see flashbacks\n"
				+ "a battle a sword with a holy crest of a phinox\n" + "death distruction and demons run rampent\n"
				+ "the last thing you feel before returning to your body is falling.");
	}

	public void wizzard() {
		JOptionPane.showMessageDialog(null, "you choose to push the wizzard as it sinks in you see flashbacks\n"
				+ "you see books a library and students\n" + "a loving wife and kids smiling back at you\n"
				+ "finding a book\n" + "the book is filled with demons and devils and a date\n" + "the time is coming\n"
				+ "you run out and try to warn people\n" + "they dont listen\n"
				+ "the last thing you remember is falling into an eternal sleep after drinking something with the label H");
	}

	public void statue() {
		JOptionPane.showMessageDialog(null,
				"you walk through the left tunnle and are almost immediatly faced with a sleeping bag\n"
						+ "you drop low hoping not to be noticed by the people around the fire there talking about some shrine your curious but are worried they might spot you\n"
						+ "you can skirt around them to the exit by going left or you could crawl right closer twords them.");
	}

	public void sneak() {
		JOptionPane.showMessageDialog(null,
				"you choose to get a closer look\n"
						+ "you sneak up closer behind some boxes and over hear them talking about the play ending in romio and juliet\n"
						+ "they were debating which poisen he used to kill himself");
		JOptionPane.showMessageDialog(null, "one insisted it was cyanide, the other said hemlock");
		JOptionPane.showMessageDialog(null,
				"\"useless\" you curse yourself they both however stop and listen you think there onto you and make a speedy escape.");
		JOptionPane.showMessageDialog(null,
				"you imerge into another tunnle again two choices however this time there seperated by a torch the \n"
						+ "right has a slight draft\n" + "and down the left tunnle you here a femenin scream");
	}

	public void leave() {
		JOptionPane.showMessageDialog(null, "its not worth getting caught you leave quickly");
		JOptionPane.showMessageDialog(null,
				"you imerge into another tunnle again two choices however this time there seperated by a torch the \n"
						+ "right has a slight draft\n" + "and down the left tunnle you here a femenin scream");
	}

}
