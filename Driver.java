import cs1.Keyboard;
public class Driver {
    public static void main(String[] args) {
	System.out.println("Please type in the integer corresponding to the strategy for Player 1.");
	System.out.println("1. User" + "\n" + "2. x" + "\n" + "3. x+1");
	int strat1 = Keyboard.readInt();
	System.out.println("Please type in the integer corresponding to the strategy for Player 2.");
	System.out.println("1. User" + "\n" + "2. x" + "\n"  + "3. x+1");
	int strat2 = Keyboard.readInt();
	Player p1, p2;
	if (strat1 == 1)  p1 = new User();
	else if (strat1 == 2) p1 = new Strat1();
	else p1 = new Strat2();
	if (strat2 == 1)  p2 = new User();
	else if (strat2 == 2) p2 = new Strat1();
	else p2 = new Strat2();
	Game game = new Game(p1, p2);
	System.out.println("How many times do you want the game to run?");
	int n = Keyboard.readInt();
	for (int i = 0; i < n; i++) game.run();
    }
}
