import java.util.ArrayList;
import java.lang.Math;
import cs1.Keyboard;

public class UI {

    private Player _comp, _r, _player;
    private int _prize;
    private ArrayList<Integer> _deck;

    public UI(Player c) {
	_comp = c;
	_r = new RandomPlayer();
	_player = new User();
	_prize = 0;
	_deck = new ArrayList<Integer>();
	for (int i=1; i<14; i++) _deck.add(i);
    }

    public void setPrize() {
	_prize = _deck.remove((int)(Math.random()*_deck.size()));
	_comp.setPrize(_prize);
	_player.setPrize(_prize);
	System.out.println("The prize card is " + _prize + ".");
    }

    public void turn() {
	setPrize();
	int move1 = _comp.makeMove();
	int move2 = _r.makeMove();	
	int move3 = _player.makeMove();
	if (!(move1 == move2 || move2 == move3 || move1 == move3)) {
	    int max = Math.max(Math.max(move1, move2), move3);
	    if (max == move1)
		_comp.setScore( _prize);
	    else if (max == move2)
		_r.setScore( _prize);
	    else
		_player.setScore(_prize);
	}
	results();
    }

    public void run() {
	while (_deck.size() > 0) {
	    turn();
	}
	//results();
    }

    public void results() {
	System.out.println
	    ("The Random Player's score is " + _r.getScore() + ".");
	System.out.println
	    ("The Computer's score is " + _comp.getScore() + ".");
	System.out.println
	    ("Your score is " + _player.getScore() + ".");
    }

    public static void main(String[] args) {
	System.out.println("Welcome to GOPS+R!");
	System.out.println
	    ("You will play against one opponent that will simply place random cards, and one from the choices below:");
	System.out.println
	    ("1. x" + "\n" + "2. x+1");
	System.out.println("Please type in the integer corresponding to the strategy you'd like to play against.");
	int strat = Keyboard.readInt();
	Player s1 = new Strat1();
	Player s2 = new Strat2();
	Player[] p = {s1, s2};
	UI interact = new UI(p[strat-1]);
	interact.run();
    }
}
	
