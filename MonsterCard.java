import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class MonsterCard extends Card{
	private int atk;
	private int def;
	private int level;
	private String attribute;
	private String type;
	private String effect;
	private static MonsterCard[] arrayOfMonsterCard = new MonsterCard[15];
	
	/*try{
    	a.bacaMonster();
    	a.bacaSpellCard();
    	a.bacaTrapCard();	
	  }
    catch (IOException ioe){

    }*/
		//MonsterCard blue = new MonsterCard(a.getArrayOfMonster()[1]);	
		//a.getArrayOfMonster()[10].printCard();
		//a.getArrayOfMonster()[14].printCard();

	public MonsterCard(){
		super();
		this.atk = 0;
		this.def = 0;
		this.level = 0;
		this.attribute = "";
		this.type = "";
		this.effect = "";
		
	}
	
	public MonsterCard(String name, String desc, double probability, int atk, int def, int level, String attribute, String type, String effect, int idKartu){
		super(name,desc, probability, idKartu);
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
	
	public boolean isUp() {
		return super.getPos()==1;
	}
	
	public boolean isDown() {
		return super.getPos() ==0;
	}
	
	public void setUp() {
		super.setUp();
	}
	
	public void setDown() {
		super.setDown();
	}
	
	public int getID() {
		return super.getID();
	}
	
	public void flipCard(){
		printCard();
		if (this.name == "Man-Eater Bug"){
			// pilih 1 kartu, lalu hancurkan kartu tersebut
			// arrat di battle, posisi kartu yang kita pilih, dimasukkin ke array graveyard, lalu array yg di field di delet.
		}else if(this.name == "Hane-Hane"){
			// ngembaliin kartu lawan ke tangan dia
			// array di battle posisi kartu yang kita pilih, dikembaliin ke array of card di tangan
		}else{
			
		}
	}
	
	public static MonsterCard[] bacaMonster()throws IOException {	
	    BufferedReader br = new BufferedReader(new FileReader("MonsterCard.txt"));
	    try {
	        while (br.readLine() != null){
	        for (int i = 0;i < 8; i++) {
	        	String name = br.readLine();
	            String desc = br.readLine();
	            double probability = Double.parseDouble(br.readLine());
	            int atk = Integer.parseInt(br.readLine());
	            int def = Integer.parseInt(br.readLine());
	            int level = Integer.parseInt(br.readLine());
	            String type = br.readLine();
	            String attribut = br.readLine();
	            String effect = br.readLine();
	            int id = Integer.parseInt(br.readLine());
	           MonsterCard monstercard = new MonsterCard(name,desc,probability,atk,def,level,type,attribut,effect,id);  
	           MonsterCard.arrayOfMonsterCard[i] = monstercard;
	        }      
		  }
	       
	    } finally {
	        br.close();
	      }
	    return arrayOfMonsterCard;    
	}
	
	public static MonsterCard[] getArrayOfMonsterCard(){
		return MonsterCard.arrayOfMonsterCard;
	}
	
	public static MonsterCard getArrayOfMonsterCardIndeks(int idx){
		return MonsterCard.arrayOfMonsterCard[idx];
	}
	
}
