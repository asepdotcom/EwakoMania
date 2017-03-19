import java.util.ArrayList;
import java.util.Random;

public class Shop {
	private Player player;
	private ArrayList<Card> deck = new ArrayList<Card>(15);
	
	public Shop(Player player, ArrayList<Card> deck) {
		this.player = player;
		this.deck = deck;
	}
	
	public void belanja() {
		System.out.println("Anda mendapatkan 3 kartu, yaitu: ");
		
		Random rand = new Random();
		
		float n = 0;
		
		do {
			n = rand.nextInt(11);
			n = n/10;
			
			if (n>=0.7) {
				int m = rand.nextInt(6)+1;
				player.database.add(deck.get(m));
				System.out.println(deck.get(m).getName());
			}
		} while(n<0.7);
		
		do {
			n = rand.nextInt(11);
			n = n/10;
			
			if (n>=0.4) {
				int m = rand.nextInt(11)+1;
				player.database.add(deck.get(m));
				System.out.println(deck.get(m).getName());
			}
		} while(n<0.4);
		
		do {
			n = rand.nextInt(11);
			n = n/10;
			
			if (n>=0.1) {
				int m = rand.nextInt(15)+1;
				player.database.add(deck.get(m));
				System.out.println(deck.get(m).getName());
			}
		} while(n<0.1);
	}
}

