//asep ewako mania
public class Arena {
	
	protected Card[] monsterZone = new Card[3];
	protected Card[] tsZone = new Card[3];
	protected Player pemain;
	protected Duelist lawan;
	
	public Arena(Player pemain,Duelist lawan) {
		this.pemain = pemain;
		this.lawan = lawan;
	}
	
	
}
