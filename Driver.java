public class Driver {
    public static void main(String[] args) {
	Player p1 = new Strat1();
	Player p2 = new Strat2();
	Game game = new Game(p1, p2);
	game.run();
    }
}
