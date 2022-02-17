package Arrays;

public class spiralMatrixMenagaMethod {

	public static void main(String[] args) {
	int[][] mena = new int[4][4];
	
	 
	 int c=0;
	 int r=0;
	 int val = 1;
	
	 for( c=0; c<4; c++ ) {
		 mena[r][c] = val;
		 val++;
	 }
	 
	 c=3;
	 for(r =1; r<4 ; r++) {
		 mena[r][c] = val;
		 val++;
	 }
	 
	 r=3;
	 for(c=2; c>=0 ; c--) {
		 mena[r][c] = val;
		 val++;
	 }
	 
	 c=0;
	 for(r=2; r>=1 ; r--) {
		 mena[r][c] = val;
		 val++;
	 }
	 
	 r=1;
	 for(c=1; c<=2 ; c++) {
		 mena[r][c] = val;
		 val++;
	 }
	 
	c=2;
	for(r=2; r<=2; r++) {
		mena[r][c] = val;
		 val++;
	}
	
	r=2;
	for(c=1; c>=1 ; c-- ) {
		mena[r][c] = val;
		 val++;
	}
	
	 
	 print(mena);

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
