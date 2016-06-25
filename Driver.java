import cs1.Keyboard;
public class Driver {
    public static void main(String[] args) {
	Player p1 = new Strat1();
	Player p2 = new Strat2();
	Game game = new Game(p1, p2);
	System.out.println("How many times do you want the game to run?");
	int n = Keyboard.readInt();
	for (int i = 0; i < n; i++) game.run();
    }
}
