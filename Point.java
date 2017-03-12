

public class Point {

	double x;

	double y;

// membuat titik dengan koordinat (0,0)



	public Point() {

		this.x = 0;

		this.y = 0;

	}

	// membuat titik dengan koordinat yang diberikan (x,y)

	public Point(double x, double y) {

		this.x = x;

		this.y = y;

	}

	//setter

	public void setX (double x){

		this.x = x;

	}

	public void setY (double y){

	this.y = y;

	}

	//getter

	public double getX (){

	return this.x;

	}

	public double getY (){

	return this.y;

	}

	/*public double distanceTo(Point p){

	double dx = this.x - p.getX();

	double dy = this.y - p.getY();

	return Math.sqrt(dx*dx + dy*dy);

	}*/

	/* Lengkapi Method ini */

	// Mengecek apakah p sama dengan Point

	public boolean isEquivalent(Point p) {
		
		return ((this.x==p.x)&&(this.y==p.y));
		
	}

	// Mengecek apakah Point berada pada titik pusat

	public boolean isOrigin() { 
		
		return ((this.x==0)&&(this.y==0));
	}

	// Mengecek kuadran dari Point

	// Prekondisi: Point tidak mungkin berada pada titik pusat
	public int kuadran() { 
			
			
			if ((this.x>0) && (this.y>9)) {
				return (1);
			} else if ((this.x>0) && (this.y<0)) {
				return (4);
			} else if ((this.x<0) && (this.y<0)) {
				return (3);
			} else {
				 
				return (2);
			}
		
			
		}
	

	// Menggeser Point sejauh x dan y

	public void move(double x, double y) { 
		this.x=this.x+x;
		this.y=this.y+y;
		
	}

	// Mencetak Point ke layar dengan format (x,y)

	public void print() { 
		System.out.print("("+getX()+","+getY()+")");
	}
	
	
	
}
