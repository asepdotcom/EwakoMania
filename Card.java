public abstract class Card {
	protected String name;
	protected String desc;
	protected double probability;
	protected int position; // 1 = up, 0 = down
	protected int battPos;
	protected int idKartu;

	public Card(){
		this.name = "";
		this.desc = "";
		this.probability = 0;
		this.idKartu = 0;
		
	}
	
	public Card(String name, String desc, double probability, int idKartu){
		this.name = name;
		this.desc = desc;
		this.probability = probability;
		this.idKartu = idKartu;
		
	}
	
	public Card(Card a){
		this.name = a.name;
		this.desc= a.desc;
		this.probability = a.probability;
		this.idKartu = a.idKartu;
	}
	
	public int getID() {
		return this.idKartu;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public void setProbability(double probability){
		this.probability = probability;
	}
	
	public double getProbability(){
		return this.probability;
	}
	
	public int getPos() {
		return this.position;
	}
	
	public int getBattPos() {
		return this.battPos;
	}
	
	public boolean isUp() {
		return this.position == 1;
	}
	
	public boolean isDown() {
		return this.position ==0;
	}
	
	public void setUp() {
		this.position = 1;
	}
	
	public void setDown() {
		this.position = 0;
	}
		
	abstract void printCard();
	
}
