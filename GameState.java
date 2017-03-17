// Blueprint for all GameState subclasses.
// Has a reference to the GameStateManager
// along with the four methods that must
// be overridden.

import java.util.Scanner;

public abstract class GameState {
	protected GameStateManager gsm;
	private String key;
	public static Scanner in = new Scanner(System.in);

	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
	}
	public void setKey(String key){
		this.key = key;
	}
	public String getKey(){
		return this.key;
	}

	public abstract void init();
	public abstract void update();
	
	public void handleInput(){
		String input = in.nextLine();
		setKey(input);
	}
	
	public abstract void print();
	
	public static void clearScreen() {
		for(int clear = 0; clear < 1000; clear++) {
			System.out.println("\b") ;
		}
	}
}
