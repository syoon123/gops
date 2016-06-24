import java.util.*;
public abstract class Player {

    //inst vars
    ArrayList<Integer> _hand;
    int _score, _prize;

    //methods
    public Player() {
	_hand = new ArrayList<Integer>();
	for(int i=1; i<14; i++) {
	    _hand.add(i);
	}
	_score = 0;
	_prize = 0;
    }
    
    public String toString() {
	String retStr="";
	for (int i=0; i<_hand.size(); i++) {
	    retStr += _hand.get(i).toString() + ", ";
	}
	return retStr;
    }

    public int getScore() {
	return _score;
    }

    public void setScore(int a) {
	_score += a;
    }

    public ArrayList<Integer> getHand() {
	return _hand;
    }
    public void setPrize(int p) {
	_prize = p;
    }
    public abstract int makeMove();
    
}
