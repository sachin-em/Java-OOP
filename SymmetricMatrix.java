import java.util.Scanner;

class Matrix {
	private int row, column;
	private boolean symmetric = true;
	private int[][] mat = new int[20][20];
	Matrix(){
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter no of rows : ");
		row = scan.nextInt();
		System.out.print("\nEnter no of columns : ");
		column = scan.nextInt();
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print("Matrix[" + (i+1) + ", " + (j+1) + "] : ");
				mat[i][j] = scan.nextInt();
				System.out.print("\n");
			}
		}
	
				
	}
	
	public boolean isSymmetric(){
		if(row != column) {
			symmetric = false;
			return symmetric;
		}
	
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(mat[i][j] != mat[j][i]){
					symmetric = false;
				}
			}
		}
		
		return symmetric;
	}
}

class SymmetricMatrix{
	public static void main(String args[]){
		Matrix m1 = new Matrix();
		if(m1.isSymmetric()) {
			System.out.println("Matrix is symmetric.");
		}else{
			System.out.println("Matrix is NOT symmetric.");
		}
	}
}



