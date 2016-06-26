//test strategy: matches bid + 1, or mod
public class Strat2 extends Player {
    public Strat2() {
	super();
    }
    public int makeMove(){
	return (_hand.remove(_hand.indexOf(_prize))+1))%14;
    }
}
