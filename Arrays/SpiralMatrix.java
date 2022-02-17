package Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[20][20];
		print(arr);
		
		logic2(arr);
		System.out.println("-----------------------------");
		print(arr);

	}
	
	
	public static void logic1(int[][] arr) {
		int col = 0;
		int row = 0;
		int val = 1;
		
		for(col =0; col<arr[row].length; col++) {
			arr[row][col] = val;
			val++;
		}
		col--;
		
		for (row =1; row<arr.length ; row++) {
			arr[row][col] = val ;
			val++;
		}
		row--;
		
		for(col = col-1 ; col>=0; col--) {
			arr[row][col] = val;
			val++;
			
		}
		col++;
		
		for(row=row-1; row>0; row--) {
			arr[row][col] = val;
			val++;
		}
		row++;
		
		for(col = col+1; col<arr[row].length-1; col++) {
			arr[row][col] = val;
			val++;
		}
		col--;
		
		for(row = row+1; row<arr.length-1; row++) {
			arr[row][col] = val;
			val++;
		}
		row--;
		
		for(col=col-1; col>0; col--) {
			arr[row][col] = val;
			val++;
		}
		
	}
	
	
	public static void logic2(int[][] arr) {
		
		int top = 0;
		int bottom = arr.length-1;
		int left = 0;
		int rigth = arr[0].length-1;
		int val = 1;
		int con = 1;
		
		while (left<=rigth && top <= bottom) {
			if (con == 1) {
			for (int col = left; col<=rigth; col++) {
				arr[top][col] = val;
				val++;
			}	
			top++;
			con++;
			
			}else if(con ==2) {
				for(int row = top; row<= bottom; row++ ) {
					arr[row][rigth] = val;
					val++;
					
				}
				
				con++;
				rigth--;
			
			}else if(con == 3) {
				for(int col = rigth; col>=left; col--) {
					arr[bottom][col] = val;
					val++;
				}
				bottom--;
				con++;
				
			}else if(con == 4) {
				for(int row = bottom; row>=top; row--) {
					arr[row][left] = val;
					val++;
				}
				left++;
				con =1;
				
			}
		}
		
		
	}
	
	
	// printing the 2d array 
	public static void print(int[][] arr) {
		for (int i=0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
