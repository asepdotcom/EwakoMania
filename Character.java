
public abstract class Character {
	protected String name;
	protected Point position;
	protected Card deck[];
	
	public Character(String name, Point position, Card[] deck){
		this.name = name;
		this.position=position;
		this.deck = new Card[15];
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
	
	
	public void setDeck(int i, Card []deck ){
		this.deck[i] = deck[i];
	}
	
	public Card getDeck(int i){
		return this.deck[i];
	}
	
	abstract void printDuelist();
}
