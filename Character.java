
import java.io.Serializable;


public class Character implements Serializable{
	private String name;
	private Point position;

	//protected Card[] deck;
	
	public Character(String name){
		this.name = name;
		this.position = new Point();
		//this.deck = new Card[15];
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setPosition(Point  position){
		this.position = position;
	}
	public Point getPosition(){
		return this.position;
	}
	
	//abstract void printDuelist();
}