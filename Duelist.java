import java.util.ArrayList;

public class Duelist extends Character{
	private int goldDrop;
	private String rank;
	
	public Duelist(String name, Point position, ArrayList<Card> deck, int goldDrop, String rank){
		super(name,position,deck);
		this.goldDrop = goldDrop;
		this.rank = rank;
	}
	
	public void setGoldDrop(int goldDrop){
		this.goldDrop = goldDrop;
	}
	public int getGoldDrop(){
		return this.goldDrop;
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	public String getRank(){
		return this.rank;
	}
	
	public void printDuelist(){
		System.out.print("Nama : ");
		System.out.println(getName());
		System.out.print("Posisi di peta : ");
		System.out.println(getPosition().getX()+","+getPosition().getX() );
		System.out.print("Gold Drop : ");
		System.out.println(getGoldDrop());
		System.out.print("Rank : ");
		System.out.println(getRank());
	}
}
