// The only subclass the fully utilizes the
// Entity superclass (no other class requires
// movement in a tile based map).
// Contains all the gameplay associated with
// the Player.

import java.io.Serializable;

public class Player extends Character implements Serializable{
	private int money;
	private static final long serialVersionUID = 1L;
	
	private final String DOWN = "s";
	private final String LEFT = "a";
	private final String RIGHT = "d";
	private final String UP = "w";

	
	// gameplay
	public Player(String name) {
		super(name);
		this.money = 0;
	}
	
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	
	// Keyboard input. Moves the player.
	public void move(String direction) {
		if (direction==DOWN){
			this.getPosition().setY(this.getPosition().getY()-1);
		}
		if (direction==UP){
			this.getPosition().setX(this.getPosition().getX()-1);
		}
		if (direction==RIGHT){
			this.getPosition().setX(this.getPosition().getX()+1);
		}
		if (direction==LEFT){
			this.getPosition().setY(this.getPosition().getY()+1);
		}
	}
	
	public void printLoc(){
		System.out.print("Koordinatmu : ");
		getPosition().print();
	}
}