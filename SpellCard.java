
public class SpellCard extends Card{
	private String effect;
	private String type;
	
	public SpellCard(String name, String desc, double probability, String effect, String type){
		super(name, desc, probability);
		this.effect = effect;
		this.type = type;
	}
	
	public void setEffect(String effect){
		this.effect = effect;
	}
	public String getEffect(){
		return this.effect;
	}
	
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	
	public void printCard(){
		System.out.print("Nama : ");
		System.out.println(getName());
		System.out.print("Desc : ");
		System.out.println(getDesc());
		System.out.print("Probability to get this card : ");
		System.out.println(getProbability());
		System.out.print("Type : ");
		System.out.println(getType());
		System.out.print("Effect : ");
		System.out.println(getEffect());
	}
}
