//test strategy: matches bid + 3, or mod
public class Strat3 extends Player {
    public Strat3() {
	super();
    }
    public int makeMove(){
	return (_hand.remove(_hand.indexOf(_prize))+3)%14;
    }
}
