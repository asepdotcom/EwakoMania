import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class TrapCard extends Card{
	private String effect;
	private static TrapCard[] arrayOfTrapCard = new TrapCard[3];
	
	public TrapCard(String name, String desc, double probability, String effect, int idKartu){
		super(name,desc,probability, idKartu);
		this.effect = effect;
	}
	
	public TrapCard(){
		super();
		this.effect = "";
	}
	
	public void setEffect(String effect){
		this.effect = effect;
	}
	
	public String getEffect(){
		return this.effect;
	}
	
	public void printCard(){
		System.out.print("Nama : ");
		System.out.println(getName());
		System.out.print("Desc : ");
		System.out.println(getDesc());
		System.out.print("Probability to get this card : ");
		System.out.println(getProbability());
		System.out.print("Effect : ");
		System.out.println(getEffect());
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
	
	public static TrapCard[] getArrayOfTrapCard(){
		return TrapCard.arrayOfTrapCard;
	}
	
	public static TrapCard getArrayOfSpellCard(int idx){
		return TrapCard.arrayOfTrapCard[idx];
	}
	
	public static TrapCard[] bacaTrapCard()throws IOException{
	 BufferedReader br = new BufferedReader(new FileReader("TrapCard.txt"));
	    try {
	        while (br.readLine() != null) {
	        for (int i = 0;i < 3; i++) {
	        	String name = br.readLine();
	            String desc = br.readLine();
	            double probability = Double.parseDouble(br.readLine());
	            String effect = br.readLine();
	            int id = Integer.parseInt(br.readLine());
	          TrapCard trapCard = new TrapCard(name,desc,probability,effect,id);
	          TrapCard.arrayOfTrapCard[i] = trapCard;
	        }      
	      } 
	    } finally {
	        br.close();
		  }
	    return TrapCard.arrayOfTrapCard;    
	}
}

