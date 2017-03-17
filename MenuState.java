// The main menu GameState.

import java.util.Scanner;

public class MenuState extends GameState {
	public static Player p = null;
	private String[] options = {
		"1. NEW GAME",
		"2. LOAD GAME",
		"3. EXIT"
	};
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		System.out.println("======== YOGS! =======");
		print();
	}
	
	public void update() {
		handleInput();
	}
	
	public void handleInput(){
		super.handleInput();
		if(getKey().equals("1")) {
			clearScreen();
			System.out.println("=== Buat char baru ===");
			System.out.print("Masukkan username : ");
			super.handleInput();
			PlayState.player = new Player(getKey());
			gsm.setState(GameStateManager.PLAY);
		}
		else if(getKey().equals("2")) {
			PlayState.player = ExternalFile.load();
			gsm.setState(GameStateManager.PLAY);
		}
		else if(getKey().equals("3")) {
			System.exit(0);
		}
	}
		
	public void print(){
		for (int i=0; i<3;i++){
			System.out.println(options[i]);
		}
	}
}
