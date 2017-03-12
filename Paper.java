

public class Paper  extends Goods {
	
	private String hint;
	
	public Paper (int w, int p, int q, String n, String d, String hint) {
		
		super(w,p,q,n,d);
		this.hint = hint;
	}
	
	public Paper() {
	
		super();
		
	}
	
	public void setHint (String hint){

		this.hint = hint;

	}
	
	public String  getHint () {

	return this.hint;

	
	}
	
	
	public void printDesc(){
		
		super.printDesc();
        System.out.println("Pesan Kertas: "+this.hint);
	
		
	}




}
