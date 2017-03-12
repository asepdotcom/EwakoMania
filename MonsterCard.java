
public class MonsterCard extends Card{
	private int atk;
	private int def;
	private int level;
	private String attribute;
	private String type;
	private String effect;

	public MonsterCard(String name, String desc, double probability, int atk, int def, int level, String attribute, String type, String effect){
		super(name,desc, probability);
		this.atk = atk;
		this.def = def;
		this.level = level;
		this.attribute = attribute;
		this.type = type;
		this.effect = effect;
	}
	
	public void setAtk(int atk){
		this.atk = atk;
	}
	public int getAtk(){
		return this.atk;
	}
	public void setDef(int def){
		this.def = def;
	}
	public int getDef(){
		return this.def;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return this.level;
	}
	public void setAttribute(String attribute){
		this.attribute = attribute;
	}
	public String getAttribute(){
		return this.attribute;	
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
		System.out.print("Attack : ");
		System.out.println(getAtk());
		System.out.print("Defend : ");
		System.out.println(getDef());
		System.out.print("Level : ");
		System.out.println(getLevel());
		System.out.print("Attributes : ");
		System.out.println(getAttribute());
		System.out.print("Type : ");
		System.out.println(getType());
		System.out.print("Effect : ");
		System.out.println(getEffect());
	}
	//if pilihan pemain menyerang terbuka, maka monster akan memakai attack 
	//untuk menyerang lawan, atau menggunakan effectnya bila ada efek flip summon
	public void menyerangTerbuka(MonsterCard monster){
		this.atk = monster.atk;
		//if activate effect, effect monster tersebut berjalan
	}
	
	public void flipCard(){
		printCard();
		if (this.name == "Man-Eater Bug"){
			//pilih 1 kartu, lalu hancurkan kartu tersebut
			//arrat di battle, posisi kartu yang kita pilih, dimasukkin ke array graveyard, lalu array yg di field di delet.
		}else if(this.name == "Hane-Hane"){
			// ngembaliin kartu lawan ke tangan dia
			//array di battle posisi kartu yang kita pilih, dikembaliin ke array of card di tangan
		}else{
			
		}
	}
}
