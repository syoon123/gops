//test strategy: matches bid + 4, or mod
public class Strat4 extends Player {
    public Strat4() {
	super();
    }
    public int makeMove(){
	return (_hand.remove(_hand.indexOf(_prize))+4)%14;
    }
}
