import java.lang.Math;
public class RandomPlayer extends Player {
    public RandomPlayer() {
	super();
    }
    public int makeMove() {
	int i = (int)(Math.random() * _hand.size());
	return _hand.remove(i);
    }
}
