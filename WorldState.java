// The main menu GameState.

import java.util.Scanner;

public class WorldState extends GameState {
	protected Scanner in = new Scanner(System.in);	
	//private ArrayList<Duelist> duelists = new ArrayList<Duelist>();
	//private char[][] map = new char[5][5];
	//private Player player = new Player();
	
	private String[] options = {
		"1. Move",
		"2. Shop",
		"3. Save",
		"4. Exit"
	};
	
	public WorldState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		print();
	}
	public void update() {
		handleInput();
	}
	
	public void handleInput(){
		if(getKey() == 1) {
			clearScreen();
			System.out.print("Move to : ");
		}
		else if(getKey() == 2) {
			clearScreen();
			System.out.print("Shop");
		}
		else if(getKey() == 3) {
			clearScreen();
			System.out.print("Save");
		}
		else if(getKey() == 4) {
			clearScreen();
			System.exit(0);
		}
	}
	
	public void print(){
		for (int i=0; i<4;i++){
			System.out.println(options[i]);
		}
	}
}
