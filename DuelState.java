import java.util.Scanner;

import java.util.ArrayList;

public class DuelState  extends GameState {
	protected Scanner in = new Scanner(System.in);	
	//private ArrayList<Duelist> duelists = new ArrayList<Duelist>();
	//private char[][] map = new char[5][5];
	//private Player player = new Player();
	
	//List kartu pada monster field
	ArrayList<MonsterCard> monsterFieldP1 = new ArrayList<MonsterCard>(3);
	ArrayList<MonsterCard> monsterFieldP2 = new ArrayList<MonsterCard>(3);
	
	//List kartu pada deck pemain
	ArrayList<Card> cardP1 = new ArrayList<Card>(15);
	ArrayList<Card> cardP2 = new ArrayList<Card>(15);

	//List kartu pada spell/trap card field
	ArrayList<Card> magicFieldP1 = new ArrayList<Card>(3);
	ArrayList<Card> magicFieldP2 = new ArrayList<Card>(3);		

	//List kartu pada graveyard
	ArrayList<Card> graveyardP1 = new ArrayList<Card>(15);
	ArrayList<Card> graveyardP2 = new ArrayList<Card>(15);

	//List kartu di tangan
	ArrayList<Card> handCardP1 = new ArrayList<Card>(5);
	ArrayList<Card> handCardP2 = new ArrayList<Card>(5);


	private int lp1,lp2 = 2000; //Lifepoint awal P1 dan P2
	public int countSummon; //max 1 kali summon per turn
	
	Player p1; 
	Duelist p2;
	
	//Konstruktor duelstate
	public DuelState(Player p1,Duelist p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.cardP1 = p1.getDeck();
		this.cardP2 = p2.getDeck();
	}
	
	private String[] battle = {
		"1. Move",
		"2. Shop",
		"3. Save",
		"4. Exit"
	};
	
	public void init() {
		print();
	}
	public void update() {
		handleInput();
	}
	
	public void handleInput(){
		if(getKey() == 1) {
			clearScreen();
			System.out.print("Move to : ");
		}
		else if(getKey() == 2) {
			clearScreen();
			System.out.print("Shop");
		}
		else if(getKey() == 3) {
			clearScreen();
			System.out.print("Save");
		}
		else if(getKey() == 4) {
			clearScreen();
			System.exit(0);
		}
	}
	
	
	
	//Print kartu yang terdapat di arena
	public void printfield(){
		int i;
		//Mencetak Nama player beserta lifepoint Player 1
		System.out.println("===========================================================================");
		System.out.println("| Player 1 ("+this.p1.getName()+")|" );
		System.out.println("| "+this.lp1+" |" );
		System.out.println("");
		
		//Mencetak nama kartu monster di field Player 1
		System.out.println("| Monster Card Zone |" );
		i = 0;
		while (i<=2) {
			System.out.print("| ");
			if (monsterFieldP1.get(i) == null) {
			System.out.print("");
			} else {
			System.out.printf(monsterFieldP1.get(i).getName());
			System.out.print(" | ");
			i++;
			}
		}
		System.out.println(" ");
		
		//Mencetak nama kartu spell/trap di field Player 1
		System.out.println("| Spell/Trap Card Field |" );
		i = 0;
		while (i<=2) {
			System.out.print("| ");
			if (magicFieldP1.get(i) == null) {
			System.out.print("");
			} else {
			System.out.printf(magicFieldP1.get(i).getName());
			System.out.print(" | ");
			i++;
			}
		}
		System.out.println(" ");
		
		//Mencetak Nama player beserta lifepoint Player 1
		System.out.println("===========================================================================");
		System.out.println("| Player 2 ("+this.p2.getName()+")|" );
		System.out.println("| "+this.lp2+" |" );
		System.out.println("");
		
		//Mencetak nama kartu monster di field Player 1
		System.out.println("| Monster Card Zone |" );
		i = 0;
		while (i<=2) {
			System.out.print("| ");
			if (monsterFieldP2.get(i) == null) {
			System.out.print("");
			} else {
			System.out.printf(monsterFieldP2.get(i).getName());
			System.out.print(" | ");
			i++;
			}
		}
		System.out.println(" ");
		
		//Mencetak nama kartu spell/trap di field Player 1
		System.out.println("| Spell/Trap Card Field Zone |" );
		System.out.println("| Spell/Trap Card Field |" );
		i = 0;
		while (i<=2) {
			System.out.print("| ");
			if (magicFieldP1.get(i) == null) {
			System.out.print("");
			} else {
			System.out.printf(magicFieldP1.get(i).getName());
			System.out.print(" | ");
			i++;
		}
		System.out.println(" ");
		System.out.println("===========================================================================");
		}
	}
	
	
	//Tampilan saat mainphase
	public void mainPhase() {
		this.countSummon = 1;
		int pil;
		do {
		System.out.println("===========================================================================");
		System.out.println("1. Summon Monster Attack");
		System.out.println("2. Summon Monster Defend");
		System.out.println("3. Place Spell Card");
		System.out.println("4. Place Trap Card");
		System.out.println("5. Use Spell/Trap Card");
		System.out.println("6. Change Battle Position");
		System.out.println("7. Battle Phase");
		System.out.println("8. End Phase");
		System.out.println("===========================================================================");
		
		pil = in.nextInt();
			if (pil==1) {
				this.summonMonsterATK();
			} else if (pil==2) {
				this.summonMonsterDEF();
			} else if (pil==3) {
				this.placeSpell();
			} else if (pil==4) {
				this.placeTrap();
			} else if (pil==5) {
				this.useSpellTrap();
			} else if (pil==6) {
				
			} else if (pil==7) {
				this.battlePhase();
				
			} else {
				System.out.println("Pilihan Salah!");
			}
		} while((pil>6) && (pil<9));
		if (pil==7) {
			this.battlePhase();
		} else if (pil==8) {
			//ganti giliran musuh
		}
	}
	
	//Tampilan saat battlephase
	public void battlePhase() {
		do {
				
			System.out.println("===========================================================================");
			System.out.println("1. Attack");
			System.out.println("2. End Phase");
			System.out.println("===========================================================================");
			System.out.println("Masukan pilihan :");
			pil = in.nextInt();
			if (pil==1) {
				this.attack();
			} if (pil==2) {
				System.out.println("Giliran selesai!");
			} else {
				System.out.println("Pilihan salah!");
			}
		} while (!(pil==2));
			
	}
	
	//Digunakan untuk attack pada battle phase
	public void attack() {
		int pil;int pil2;
		ArrayList<MonsterCard> copyMonster = new ArrayList<MonsterCard>(monsterFieldP1);
		int i=0;
		do {
			do {
				
				int b = 0;
				while ((b<copyMonster.size())) {
					if (copyMonster.get(b).isAtk()) {
						System.out.println(b+". "+copyMonster.get(b).getName());
					}
					b++;
				}
				int end = copyMonster.size()+1;
				System.out.println(end+". End Phase");
				System.out.println("Pilih Monster Card :");
				pil = in.nextInt();
				
				if ((pil>copyMonster.size()+1) || (copyMonster.get(pil).isDef())) {
					System.out.println("Pilihan Salah!");
				}
				
			} while ((pil>copyMonster.size()+1) || (copyMonster.get(pil).isDef()));
			
			if (pil==copyMonster.size()+1) {
				break;
			} else {
				
			
			
				do {
					
					int b = 0;
					while ((b<monsterFieldP2.size())) {
						
						System.out.println(b+". "+monsterFieldP2.get(b).getName());
						
						b++;
					}
				
					System.out.println("Pilih Monster Card yang akan diserang");
					pil2 = in.nextInt();
					if (pil2<=monsterFieldP2.size()) {
						if (monsterFieldP2.get(pil2).isAtk()) {
							if (copyMonster.get(pil).getAtk()>monsterFieldP2.get(pil2).getAtk()) {
								lp2=lp2-(copyMonster.get(pil).getAtk()-monsterFieldP2.get(pil2).getAtk());
								if (lp2<0) {
									lp2=0;
								}
								monsterFieldP2.remove(pil2);
								copyMonster.remove(pil);
							} else if (copyMonster.get(pil).getAtk()==monsterFieldP2.get(pil2).getAtk()) {
								monsterFieldP2.remove(pil2);
								monsterFieldP1.remove(pil);
								copyMonster.remove(pil);
							} else if (copyMonster.get(pil).getAtk()<monsterFieldP2.get(pil2).getAtk()) {
								lp1=lp1-(monsterFieldP2.get(pil2).getAtk()-copyMonster.get(pil).getAtk());
								if (lp1<0) {
									lp1=0;
								}
								monsterFieldP1.remove(pil);
								copyMonster.remove(pil);
							}
						} else if (monsterFieldP2.get(pil2).isDef()) {
							if (copyMonster.get(pil).getAtk()>monsterFieldP2.get(pil2).getDef()) {
								monsterFieldP2.remove(pil2);
								copyMonster.remove(pil);
							} else if (copyMonster.get(pil).getAtk()==monsterFieldP2.get(pil2).getDef()) {
								
								copyMonster.remove(pil);
							} else if (copyMonster.get(pil).getAtk()<monsterFieldP2.get(pil2).getDef()) {
								lp1=lp1-(monsterFieldP2.get(pil2).getDef()-copyMonster.get(pil).getAtk());
								if (lp1<0) {
									lp1=0;
								}
								monsterFieldP1.remove(pil);
								copyMonster.remove(pil);
							}
						}
					} else {
							System.out.println("Pilihan salah!");
					}
				} while (pil2>monsterFieldP2.size());
			}
		} while ((!(pil==4)) || (copyMonster.size()>0));
		
	}
		
	//Digunakan untuk memindahkan 5 kartu dari deck ke tangan
	public void draw5P1() {
		int i=0;
		while (i<5) {
			handCardP1.add(cardP1.get(i));
			i++;
		}
	}
	
	public void draw5P2() {
		int i=0;
		while (i<5) {
			handCardP2.add(cardP2.get(i));
			i++;
		}
		
	}
	
	
	//Digunakan untuk memindahkan 1 kartu dari deck ke tangan
	public void drawP1() {
		if (handCardP1.size()<5) {
			handCardP1.add(cardP1.get(0));
		} else if (cardP2.size()==0){
			System.out.println("Kartu di deck sudah habis");
		} else {
			System.out.println("Kartu di tangan sudah penuh (5)");
		}
	}
	
	public void drawP2() {
		if (handCardP2.size()<5) {
			handCardP2.add(cardP2.get(0));
		} else if (cardP2.size()==0){
			System.out.println("Kartu di deck sudah habis");
		} else {
			System.out.println("Kartu di tangan sudah penuh (5)");
		}
		
	}
	
	public void activateMonster(ArrayList<Card> kartu, int i) {
		int pil;
		if (kartu.get(i).getID()==4) {
			if (monsterFieldP2.size()>0) {
				do {
				this.printListCards(monsterFieldP2);
				System.out.println("Pilih kartu monster yang akan dikembalikan ke tangan");
				pil = in.nextInt();
				
				} while (pil>(monsterFieldP2.size()-1));
				handCardP2.add(monsterFieldP1.get(i));
				monsterFieldP2.remove(i);
				
			} else {
				System.out.println("Tidak ada kartu monster di field musuh");
			}
			
			
		} else if (kartu.get(i).getID()==5) {
			if (monsterFieldP2.size()>0) {
				do {
				this.printListCards(monsterFieldP2);
				System.out.println("Pilih kartu monster yang akan dihancurkan");
				pil = in.nextInt();
				
				} while (pil>(monsterFieldP2.size()-1));
				toGraveyardP2(monsterFieldP1,i);
				
			} else {
				System.out.println("Tidak ada kartu monster di field musuh");
			}
			
		}
		
		
		
	}
	
	public void useSpellTrap() {
		int pil;
		if (magicFieldP1.size()>0) {
			do {
			printListCards(magicFieldP1);
			System.out.println("Pilih kartu yang ingin diaktifkan");
			pil = in.nextInt();
			if (pil>magicFieldP1.size()-1) {
				System.out.println("Pilihan salah!");
				
			}
			} while (pil>magicFieldP1.size()-1);
			if (magicFieldP1.get(pil).getClass().getSimpleName()=="TrapCard") {
				activateTrap(magicFieldP1,pil);
			} else if (magicFieldP1.get(pil).getClass().getSimpleName()=="SpellCard") {
				activateSpell(magicFieldP1,pil);
			}
				
			
			
		}
		
		
	}
		
	
	//Digunakan untuk mengaktifkan efek kartu
	public void activateSpell(ArrayList<Card> kartu,int i) { //kartu spell belum dipindahkan ke graveyard setelah activate
		int pil;
		if (kartu.get(i).getID()==9) {
			if (monsterFieldP2.size()>0) {
				System.out.prinlt(monsterFieldP2.get(0).getName()+" berhasil dihancurkan");
				this.toGraveyardP2(monsterFieldP2,0);
				this.toGraveyard(kartu,i);
				
				
				
			} else {
				System.out.println("Tidak ada kartu monster di field musuh");
			
		} else if (kartu.get(i).getID()==10) {
			if ((monsterFieldP2.size()>0) && (monsterFieldP1.size()<2)) {
				this.printListCards(monsterFieldP2);
				do {
					System.out.println("Pilih satu monster yang ingin dikendalikan");
					pil = in.nextInt();
					
				} while (pil>monsterFieldP2.size()-1);
				monsterFieldP1.add(monsterFieldP2.get(pil));
				this.toGraveyard(kartu,i);
				
				
		} else if (kartu.get(i).getID()==11) {
			if (monsterFieldP2.size()>0) {
				do {
					System.out.println("Pilih satu monster yang ingin diubah posisinya");
					pil = in.nextInt();
					
				} while (pil>monsterFieldP2.size()-1);
				monsterFieldP2.get(i).setDefend();
				monsterFieldP2.get(i).setDown();
				this.toGraveyard(kartu,i);
				
			
		} else if (kartu.get(i).getID()==12) {
			if (monsterFieldP1.size()>0) {
				do {
					System.out.println("Pilih satu monster Winger-Beast");
					pil = in.nextInt();
					
					
				} while ((pil>monsterFieldP2()-1));
				if (monsterFieldP1.get(pil).getType()=="Winged Beast") {
						monsterFieldP1.get(pil).setAtk(monsterFieldP1.get(pil).getAtk()+300);
						this.toGraveyard(kartu,i);
				
				} else {
						System.out.println("Pilihan bukan monster Winged-Beast");
					
				}
					
			}
			
					
			
		}
		
		
	
	
		
	}
	
	public void activateTrap(ArrayList<Card> kartu, int i) {
		int pil;
		if (kartu.get(i).getID()==13) {
			
			
			
		} else if (kartu.get(i).getID()==14) {
			
			
			
		} else if (kartu.get(i).getID()==15) {
			
		}
		
		
	}
	
	
	
	public void summonP2() {
		if (handCardP2.size()>0) {
			monsterFieldP2.add(handCardP2.get(0));
		} 
		
	}
		
	//Method untuk summon monster dalam kondisi ATK dan UP
	public void summonMonsterATK() {
		int i;
		if ((this.monsterFieldP1.size()<3) && ((this.countSummon) >0)){
			
			this.printListCards(handCardP1);
			System.out.println("Pilih kartu :");
			int pil = in.nextInt();
			
			//String className = handCardP1.get(i).getClass().getSimpleName();
			//kurang if kembali nama class = monster
			if (handCardP1.get(pil).getClass().getSimpleName()=="MonsterCard") {
				this.handCardP1.get(pil).setUp();
				this.handCardP1.get(pil).setAttack();
				this.monsterFieldP1.add(handCardP1.get(pil));
				this.handCardP1.remove(pil);
				this.countSummon = this.countSummon -1;
			} else {
				System.out.println("Tipe Kartu Salah");
			}
		} else {
			System.out.println("Monster Card Zone Sudah Penuh!");
		}
	}
	
	//Method untuk summon monster dalam kondisi DEF dan DOWN
	public void summonMonsterDEF() {
		
		if ((this.monsterFieldP1.size()<3) && ((this.countSummon) >0)) {
			
			this.printListCards(handCardP1);
			System.out.println("Pilih kartu :");
			int pil = in.nextInt();
			
			//kurang if kembali nama class == MonsterCard
			if (handCardP1.get(pil).getClass().getSimpleName()=="MonsterCard") {
				this.handCardP1.get(pil).setDown();
				this.handCardP1.get(pil).setDefend();
				this.monsterFieldP1.add(handCardP1.get(pil));
				this.handCardP1.remove(pil);
				this.countSummon = this.countSummon -1;
			} else {
				System.out.println("Tipe Kartu Salah");
			}
		
		} else {
			System.out.println("Monster Card Zone Sudah Penuh!");
		}
	}
	
	//Method untuk place Spell card dalam kondisi DOWN
	public void placeSpell() {
		if (this.magicFieldP1.size()<3) {
			this.printListCards(handCardP1);
			System.out.println("Pilih kartu :");
			int pil = in.nextInt();
			
			if (handCardP1.get(pil).getClass().getSimpleName()=="SpellCard") {
				this.handCardP1.get(pil).setDown();
				this.magicFieldP1.add(handCardP1.get(pil));
				this.handCardP1.remove(pil);
			} else {
				System.out.println("Tipe Kartu Salah");
			}
		} else {
			System.out.println("Spell/Trap Card Zone Sudah Penuh!");
		}
		
	}	
	
	//Method untuk place Trap card dalam kondisi DOWN
	public void placeTrap() {
		if (this.magicFieldP1.size()<3) {
			this.printListCards(handCardP1);
			System.out.println("Pilih kartu :");
			int pil = in.nextInt();
			
			if (handCardP1.get(pil).getClass().getSimpleName()=="TrapCard") {
				this.handCardP1.get(pil).setDown();
				this.magicFieldP1.add(handCardP1.get(pil));
				this.handCardP1.remove(pil);
			} else {
				System.out.println("Tipe Kartu Salah");
			}
		} else {
			System.out.println("Spell/Trap Card Zone Sudah Penuh!");
		}
		
	}	
	
	//Memindahkan kartu pada list kartu dengan index i ke graveyard
	public void toGraveyard(ArrayList<Card> kartu,int i) {
			this.graveyardP1.add(kartu.get(i));
			kartu.remove(kartu.get(i));
	}
		
	public void toGraveyardP2(ArrayList<Card> kartu,int i) {
			this.graveyardP2.add(kartu.get(i));
			kartu.remove(kartu.get(i));
	}
		
		
	
	//Method untuk print list kartu
	public void printListCards(ArrayList<Card> kartu) { 
		int i = 0;
		while ((i<kartu.size())) {
			System.out.println(i+". "+kartu.get(i).getName());
			i++;
		}
	}
		
	public void print(){
		for (int i=0; i<4;i++){
			System.out.println(battle[i]);
		}
		
	}
}
