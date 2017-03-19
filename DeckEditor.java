
import java.util.ArrayList;
import java.util.Scanner;


public class DeckEditor {
	protected Scanner in = new Scanner(System.in);	
	Player pemain;
	
	public DeckEditor(Player p1) {
		this.pemain = p1;
	}
	
	
	
	
	public void EditDeck() {
		int pil;
		do {
			System.out.println("=====    Deck Editor    ======");
			System.out.println("1. Pindahkan kartu dari deck ke database");
			System.out.println("2. Pindahkan kartu dari database ke deck");
			System.out.println("3. Buang kartu dari database");
			System.out.println("4. Keluar");
			pil = in.nextInt();
			if (pil==1) {
				this.printKartu(pemain.getDeck());
				System.out.println("Pilih kartu yang ingin dipindahkan");
				int a;
				ArrayList<Card> kartu = new ArrayList<Card>(pemain.getDeck());
				
				ArrayList<Card> base = new ArrayList<Card>(pemain.getDatabase());
				a = in.nextInt();
				if ((a<pemain.getDeck().size()) && (pemain.getDatabase().size()<100)){
					
					base.add(pemain.getDeck().get(a));
					kartu.remove(a);
					pemain.setDatabase(base);
					pemain.setDeck(kartu);
					System.out.println("Kartu berhasil dipindahkan!");
					
				
				} else {
					
					System.out.println("Pilihan salah atau database sudah penuh!");
					
					
				}
				
				
			} else if (pil==2) {
				this.printKartu(pemain.getDatabase());
				System.out.println("Pilih kartu yang ingin dipindahkan");
				int a;
				ArrayList<Card> kartu = new ArrayList<Card>(pemain.getDeck());
				
				ArrayList<Card> base = new ArrayList<Card>(pemain.getDatabase());
				a = in.nextInt();
				if ((a<pemain.getDatabase().size()) && (pemain.getDeck().size()<15)){
					
					kartu.add(pemain.getDatabase().get(a));
					base.remove(a);
					System.out.println("Kartu berhasil dipindahkan!");
					pemain.setDatabase(base);
					pemain.setDeck(kartu);
					
				
				} else {
					
					System.out.println("Pilihan salah atau deck sudah penuh!");
				
					
				}
				
			
			} else if (pil==3) {
				this.printKartu(pemain.getDatabase());
				System.out.println("Pilih kartu yang ingin dibuang");
				int a;
				ArrayList<Card> base = new ArrayList<Card>(pemain.getDatabase());
				
				a = in.nextInt();
				if (a<pemain.getDatabase().size()) {
					
				
					base.remove(a);
					System.out.println("Kartu berhasil dibuat");
					pemain.setDatabase(base);

					
				
				} else {
					
					System.out.println("Pilihan salah!");
			
					
				}
			
			} else if (pil==4) {
				break;
			} else {
				System.out.println("Pilihan salah");
			}
			
			
		} while (pil<=4);
			
			
		
		
	}
	
	
	public void printKartu(ArrayList<Card> kartu) {
	int i;
		for(i=0;i<=kartu.size();i++) {
			
			System.out.println(i+". "+kartu.get(i).getName());
		}
	
	
	}
	
	
	
	





}
