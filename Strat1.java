//test strategy: matches bid
public class Strat1 extends Player {
    public Strat1() {
	super();
    }
    public int makeMove(){
	_hand.remove(_hand.indexOf(_prize));
	return _prize;
    }
}
