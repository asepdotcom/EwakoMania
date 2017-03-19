// Blueprint for all GameState subclasses.
// Has a reference to the GameStateManager
// along with the four methods that must
// be overridden.


public abstract class GameState {
	protected GameStateManager gsm;

	private int key;

	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
	}
	public void setKey(int key){
		this.key = key;
	}
	public int getKey(){
		return this.key;
	}

	public abstract void init();
	public abstract void update();
	public abstract void handleInput(){
		int input = Integer.parseInt(in.nextLine());
		setKey(input);
		
	}
	public abstract void print();
	
	public static void clearScreen() {
		for(int clear = 0; clear < 1000; clear++) {
			System.out.println("\b") ;
		}
	}
}
