import cs1.Keyboard;
import java.io.FileWriter;
import java.io.IOException;
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
	roundRobin(0);
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
	for (int i=0; i<5; i++) {
	    for (int j=i+1; j<5; j++) {
		String filename = "tables/" + "S" + i + "S" + j + ".csv";
		try {
		    FileWriter writer = new FileWriter(filename,true);
		    writer.append("S"+i + "," + "S"+j + ",R\n");
		    for (int r=0; r<10; r++) {
			Player p1 = initStrat(i);
			Player p2 = initStrat(j);
			Game game = new Game(p1, p2);
			writer.append(game.run());
		    }
		}
		catch(Exception e) {
		    System.out.println("Error.");
		}
	    }
	}
    }
}
