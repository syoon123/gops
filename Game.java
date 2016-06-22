public class Game {
    //inst vars
    private Player _p1, _p2, _r;
    private int _bid;
    //constructor
    public Game(Player p1, Player p2) {
	_p1 = p1;
	_p2 = p2;
	_r = new  RandomPlayer();
    }
    //accessors
    public int bid() {
	return _bid;
    }
}
