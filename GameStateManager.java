// The GameStateManager does exactly what its
// name says. It contains a list of GameStates.
// It decides which GameState to update() and
// draw() and handles switching between different
// GameStates.


public class GameStateManager {
	
	private GameState[] gameStates;
	private int currentState;
	private int prevState;
	
	public static final int NUM_STATES = 5;
	public static final int MENU = 0;
	public static final int WORLD = 1;
	public static final int DUEL = 2;
	public static final int DECKEDIT = 3;
	public static final int SHOP = 4;
	
	public GameStateManager() {
		
		gameStates = new GameState[NUM_STATES];
		setState(MENU);
		
	}
	
	public void setState(int i) {
		prevState = currentState;
		unloadState(prevState);
		currentState = i;
		if(i == MENU) {
			gameStates[i] = new MenuState(this);
			gameStates[i].init();
		}
		else if(i == WORLD) {
			gameStates[i] = new WorldState(this);
			gameStates[i].init();
		}
		/*else if(i == DUEL) {
			gameStates[i] = new DuelState(this);
			gameStates[i].init();
		}
		else if(i == DECKEDIT) {
			gameStates[i] = new DeckEditState(this);
			gameStates[i].init();
		}
		else if(i == SHOP) {
			gameStates[i] = new ShopState(this);
			gameStates[i].init();
		}*/
	}
	
	public void unloadState(int i) {
		gameStates[i] = null;
	}
	
	public void update() {
		if(gameStates[currentState] != null) {
			gameStates[currentState].update();
		}
	}
}
