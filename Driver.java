import cs1.Keyboard;
import java.io.*;
public class Driver {
    public static void main(String[] args) {
	/*
	  System.out.println("Please type in the integer corresponding to the strategy for Player 1.");
	  System.out.println("1. User" + "\n" + "2. x" + "\n" + "3. x+1");
	  int strat1 = Keyboard.readInt();
	  System.out.println("Please type in the integer corresponding to the strategy for Player 2.");
	  System.out.println("1. User" + "\n" + "2. x" + "\n"  + "3. x+1");
	  int strat2 = Keyboard.readInt();
	  System.out.println("How many times do you want the game to run?");
	  int n = Keyboard.readInt();
	  for (int i = 0; i < n; i++) {	    
	  Player p1, p2;
	  if (strat1 == 1)  p1 = new User();
	  else if (strat1 == 2) p1 = new Strat1();
	  else p1 = new Strat2();
	  if (strat2 == 1)  p2 = new User();
	  else if (strat2 == 2) p2 = new Strat1();
	  else p2 = new Strat2();
	  Game game = new Game(p1, p2);
	  game.run();
	  }
	*/
	roundRobin(5);
    }

    public static Player initStrat(int s) {
	Player ret;
	if (s==0)
	    ret = new Strat0();
	if (s==1)
	    ret = new Strat1();
	if (s==2)
	    ret = new Strat2();
	if (s==3)
	    ret = new Strat3();
	if (s==4)
	    ret = new Strat4();
	else
	    ret = new RandomPlayer();
	return ret;
    }

    public static void roundRobin(int k) {
	ScoreChart scores = new ScoreChart(k);
	for (int i=0; i<k; i++) {
	    for (int j=i+1; j<k; j++) {		
		    Player p1 = initStrat(i);
		    Player p2 = initStrat(j);
		    Game game = new Game(p1, p2);
		    game.run();
		    scores.append(i,p1.getScore(),j,p2.getScore());
	    }
	}
	try {
	    String filename = "tables/RoundRobin" + k + "x" + k + ".csv";
	    File file = new File(filename);
	    file.createNewFile();
	    FileWriter writer = new FileWriter(filename);
	    writer.write(scores.toString());
	    writer.flush();
	    writer.close();
	}
	catch (Exception e) {
	    System.out.println("Error.");
	}
    }
}
