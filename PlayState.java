// The main menu GameState.

import java.util.Scanner;

public class PlayState extends GameState {
	//private ArrayList<Duelist> duelists = new ArrayList<Duelist>();
	//private Point[][] map = new Point[11][11];
	public static Player player;
	public static char[][] map = new map[11][11];
	
	private String[] options1 = {
		"1. Move",
		"2. Save",
		"3. Exit"
	};
	private String[] options2 = {
		"1. Move",
		"2. Save",
		"3. Exit",
		"4. Shop"
	};
	private String[] options3 = {
		"1. Move",
		"2. Save",
		"3. Exit",
		"4. Duel"
	};
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}
		
	public void init() {
		clearScreen();
		print();
	}
	public void update() {
		handleInput();
	}
	
	public void handleInput(){
		super.handleInput();
		if(getKey().equals("1")) {
			clearScreen();
			System.out.println("Move to");
			super.handleInput();
			player.move(getKey());
		}
		else if(getKey().equals("2")) {
			ExternalFile.save(player);
		}
		else if(getKey().equals("3")) {
			System.exit(0);
		}
		else if(getKey().equals("4")) {
			printMap();
		}
		//}
		//else if(getKey().equals("4")&&) {
			//System.out.println(p.getName());
			//System.out.println("benarji?");
		//}
	}
	
	public void print(){
		System.out.println("Selamat datang di Pulau Duelist");
		for (String opt: options1){
			System.out.println(opt);
		}
	}
	
	public void printDirection(){
		System.out.println("up: w");
		System.out.println("down: s");
		System.out.println("left: a");
		System.out.println("right: d");
	}
	
	public void printMap(){
		for (int i=0; i<map.length; i++){
			for (int j=0; j<map.length; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}