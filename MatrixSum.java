
import java.util.Scanner;

class Matrix{
	public int mat[][] = new int[20][20];	
	public int sum[][] = new int[20][20];
	public int rows, cols;
	
	Matrix(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of rows : ");
		rows = sc.nextInt();
		System.out.print("\nEnter the number of columns : ");
		cols = sc.nextInt();
		
		System.out.println("Enter the elements of matrix");
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= cols; j++){
				this.mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void calcSum(Matrix m){
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= cols; j++){
				this.sum[i][j] = this.mat[i][j] + m.mat[i][j];
			}
		}
		
	}
	
	public void display(){
		for(int i = 1; i <= rows; i++){
			System.out.println("");
			for(int j = 1; j <= cols; j++){
				System.out.print(this.sum[i][j] + "  ");
			}
		}
	}
	
}

class MatrixSum{

	public static void main(String args[]){
		System.out.println("Creating First Matrix\n==============================\n");
		Matrix m1 = new Matrix();
	
		System.out.println("Creating Second Matrix\n==============================\n");
		Matrix m2 = new Matrix();
		m1.calcSum(m2);
	
		System.out.println("Displaying sum Second Matrix\n==============================\n");
		m1.display();
	}	
}





















