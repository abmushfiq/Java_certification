package Arrays;

public class MatrixAdditional {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][] b = {{4,4,4,4},{5,5,5,5},{6,6,7,4}};
		
		print(addition(a,b));
		
		

	}
	
	
	public static int[][] addition(int[][] a, int[][] b) {
		
		
		
		int[][] c = new int[a.length][a[0].length];
		for(int row =0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				c[row][col] = a[row][col]+b[row][col];
			}
		}
		
		return c;
	}
	
	public static void print(int[][] arr) {
		for (int i=0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
