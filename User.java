import cs1.Keyboard;
public class User extends Player {
    public User() {
	super();
    }
    public int makeMove() {
	System.out.println("What card would you like to put down?");
	System.out.println(this);
	return _hand.remove(_hand.indexOf(Keyboard.readInt()));
    }
}
