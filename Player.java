import java.util.ArrayList;

public class Player extends Character {
	private int money;
	ArrayList<Card> database = new ArrayList<Card>(100);
	
	public Player(String name, Point position, int money, ArrayList<Card> deck,ArrayList<Card> database){
		super(name,position,deck);
		this.money = money;
		this.database = database;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return this.money;
	}
	
	public void setDatabase(ArrayList<Card> database ){
		this.database = database;
	}
	
	public ArrayList<Card> getDeck() {
		return super.getDeck();
	}
	
	public void setDeck(ArrayList<Card> kartu) {
		super.setDeck(kartu);
		
	}
	public ArrayList<Card> getDatabase(){
		return this.database;
	}
	public void printDuelist(){
		System.out.print("Nama : ");
		System.out.println(getName());
		System.out.print("Posisi di peta : ");
		System.out.println(getPosition().getX()+","+getPosition().getX() );
		System.out.print("Money : ");
		System.out.println(getMoney());
		
	}
}
