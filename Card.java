
public abstract class Card {
	protected String name;
	protected String desc;
	protected double probability;
	
	public Card(String name, String desc, double probability){
		this.name = name;
		this.desc = desc;
		this.probability = probability;
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
	
	abstract void printCard();
	
}
