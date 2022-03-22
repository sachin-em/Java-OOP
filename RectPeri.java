import java.util.Scanner;

class Rectangle{
	private int l, b;
	
	// default constructor
	
	Rectangle(){
		this.l = 10;
		this.b = 5;
	}
	
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	public int perimeter(){
		int peri = 2 * (l + b);
		return peri;
	}
}

class RectPeri{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("\nEnter the length of the rectangle : ");
	int l = sc.nextInt();
	System.out.print("\nEnter the breadth of the rectangle : ");
	int b = sc.nextInt();
	
	Rectangle rect1 = new Rectangle(l, b);
	System.out.println("Perimeter of user defined Rectangle  = " + rect1.perimeter());
	
	Rectangle rect  = new Rectangle();
	System.out.println("Perimeter of default Rectangle  = " + rect.perimeter());
	
		
	}
}
