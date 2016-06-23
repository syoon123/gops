//test strategy: matches bid + 1
public class Strat2 extends Player {
    public Strat1() {
	super();
    }
    public int makeMove(){
	return _hand.remove(_hand.indexOf(_prize))+1;
    }
}
