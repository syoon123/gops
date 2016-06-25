import java.util.ArrayList;
import java.lang.Math;
public class Game {
    //inst vars
    private Player _p1, _p2, _r;
    private int _prize;
    private ArrayList<Integer> _deck;
    //constructor
    public Game(Player p1, Player p2) {
	_p1 = p1;
	_p2 = p2;
	_r = new RandomPlayer();
	_prize = 0;
	_deck = new ArrayList<Integer>();
	for (int i=1; i<14; i++) _deck.add(i);
    }
    //accessors
    public void setPrize() {
	_prize = _deck.remove((int)(Math.random()*_deck.size()));
	_p1.setPrize(_prize);
	_p2.setPrize(_prize);	
    }
    public void turn() {
	setPrize();
	int move1 = _p1.makeMove();
	int move2 = _p2.makeMove();
	int move3 = _r.makeMove();
	if (move1 > move2 && move1 > move3) {
	    _p1.setScore(_prize);
	}
	else if (move2 > move1 && move2 > move3) {
	    _p2.setScore(_prize);
	}
	else if (move3 > move1 && move3 > move2) {
	    _r.setScore(_prize);
	}
    }
    public void run() {
	while (_deck.size() > 0) {
	    turn();
	}
	results();
    }
    public void results() {
	System.out.println(_p1.getScore());
	System.out.println(_p2.getScore());
	System.out.println(_r.getScore());
    }
}
