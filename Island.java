
public class Island {
	
	protected char[][] peta;
	protected Player pemain;
	protected Duelist[] musuh;
	Toko toko;

	
	public Island(char[][] peta, Player pemain, Duelist[] enemy, Card[] k) {
		this.peta = peta;
		this.pemain = pemain;
		this.musuh = musuh;
		this.toko = new Toko(k);
	}
	
	
	
	public class Toko {
		protected Card[] kartu;
		int hargaKartu = 500;
	
		public Toko(Card[] kartu){
			this.kartu = kartu;
		}
		
		//method beliKartu
		
	}	
}
