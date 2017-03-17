// The GamePanel is the drawing canvas.
// It contains the game loop which
// keeps the game moving forward.
// This class is also the one that grabs key events.


public class Main {	
	public static void main (String[] args){
		GameStateManager gsm;
		gsm = new GameStateManager();
		for(;;){
			gsm.update();
		}
	}			
}