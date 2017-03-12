
public class Player extends Character {
	private int money;
	Card[] database;
	
	public Player(String name, Point position, int money, Card[] deck,Card[] database){
		super(name,position,deck);
		this.money = money;
		this.database = new Card[100];
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return this.money;
	}
	
	public void setDatabase(int i, Card []database ){
		this.database[i] = database[i];
	}
	
	public Card getDatabase(int i, Card []database ){
		return this.database[i];
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
