
import java.util.ArrayList;

public abstract class Character {
	
	
	protected String name;
	protected Point position;
	protected ArrayList<Card> deck = new ArrayList<Card>(15);
	
	public Character(String name, Point position, ArrayList<Card> deck){
		this.name = name;
		this.position=position;
		this.deck = deck;
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
	public Point  getPosition(){
		return this.position;
	}
	
	
	public void setDeck(ArrayList<Card> deck ){
		this.deck = deck;
	}
	
	public ArrayList<Card> getDeck(){
		return this.deck;
	}
	
	abstract void printDuelist();
}
