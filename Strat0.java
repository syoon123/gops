//test strategy: matches bid
public class Strat0 extends Player {
    public Strat0() {
	super();
    }
    public int makeMove(){
	return _hand.remove(_hand.indexOf(_prize));
    }
}
