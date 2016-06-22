import java.util.*;
public abstract class Player {

    //inst vars
    ArrayList<Integer> _hand;
    int _score, _prize;

    //methods
    public Player() {
	for(int i=1; i<14; i++) {
	    _hand.add(i);
	}
	_score = 0;
	_prize = 0;
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
