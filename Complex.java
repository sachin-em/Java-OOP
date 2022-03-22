import java.util.Scanner;

class ComplexNumber{
	int real, img;
	
	ComplexNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Real Part : ");
		this.real = sc.nextInt();
		System.out.print("Enter the Imaginary Part : ");
		this.img = sc.nextInt();
				
	}
	
	public String add(ComplexNumber c){
		int sum_real  = this.real + c.real;
		int sum_img  = this.img + c.img;
		String result = "" + sum_real + " + " + sum_img + "i";
		return result;
	}
}

class Complex{
	public static void main(String args[]){
		System.out.println(" Enter the first complex number");
		ComplexNumber c1 = new ComplexNumber();
		System.out.println(" Enter the first complex number");
		ComplexNumber c2 = new ComplexNumber();
		
		
		
		String result = c1.add(c2);
		System.out.println("Sum = " + result);
	}
}
