// The main menu GameState.

import java.util.Scanner;

public class MenuState extends GameState {
	protected Scanner in = new Scanner(System.in);
	private String[] options = {
		"1. NEW GAME",
		"2. LOAD GAME",
		"3. EXIT"
	};
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		print();
	}
	
	public void update() {
		handleInput();
	}
	
	public void handleInput(){
		super.handleInput();
		if(getKey() == 1) {
			clearScreen();
			System.out.println("=== Buat char baru ===");
			System.out.print("Masukkan username : ");
			String name = in.nextLine();
			gsm.setState(GameStateManager.WORLD);
		}
		else if(getKey() == 2) {
			gsm.setState(GameStateManager.WORLD);
		}
		else if(getKey() == 3) {
			System.exit(0);
		}
	}
		
	public void print(){
		for (int i=0; i<3;i++){
			System.out.println(options[i]);
		}
	}
}
