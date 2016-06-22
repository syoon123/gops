import java.util.*;
public abstract class Player {

    //inst vars
    ArrayList<Integer> _hand;
    int _score;

    //methods
    public Player() {
	for(int i=1; i<14; i++) {
	    _hand.add(i);
	}
	_score = 0;
    }
    
    public String toString() {
	String retStr="";
	for (Integer i : _hand) {
	    retStr = i + " ";
	}
	return retStr;
    }

    public int getScore() {
	return _score;
    }

    public ArrayList<Integer> getHand() {
	return _hand;
    }

    public abstract int makeMove();
    
}
