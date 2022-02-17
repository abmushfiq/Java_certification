package Arrays;

import java.util.Scanner;

public class Basic {
	

	
	public static void main(String[] args) {
		
//		int[][] arr = new int[8][4];
//		 addElement(arr);
//		 print(arr);
		
		
		
		
		
		        Scanner sc = new Scanner(System.in);
				System.out.println("Enter the matrix row ");
				int n= sc.nextInt();
				System.out.println("Enter the matrix col ");
				int a= sc.nextInt();
				int[][]m =new int[n][a];
				  int val= 1;
				  int minrow=0;
				  int maxrow=n-1;
				  int mincol=0;
				  int maxcol=a-1;
				  while (val<=(n*a)) {
				 for(int i=mincol;i<=maxcol;i++) {
				 m[minrow][i]=val;val++;
				 }
				 for(int i=minrow+1;i<=maxrow;i++) {
				 m[i][maxcol]=val;val++;
				}
				 for(int i=maxcol-1;i>=mincol;i--) 
				 {
				  m[maxrow][i]=val;val++;
				 }
				 for(int i=maxrow-1;i>=minrow+1;i--) 
				 {
				  m[i][mincol]=val;val++;
				 }
				 mincol++;
				 maxcol--;
				 minrow++;
				 maxrow--;
				    }
				 // output
				      for( int r=0;r<n;r++)
				      {
				       for(int c=0;c<a;c++) 
				       {
				        System.out.print(m [r]  [c] +"  ");
				       }
				        System.out.println( );
				      }
				 
				   
				
		 
		

}	
	
	public static void addElement(int[][] arr) {
		int val = 1;
		int row = 0;
		while(row<arr.length) {
			if(row==0 || row%2==0) {
				for(int i=0; i<arr[row].length; i++) {
					arr[row][i] = val;
					val++;
				}
				

			}else {
				for(int i=arr[row].length-1 ; i>=0;i-- ) {	
					arr[row][i] = val;
					val++;
				}
				
			}
			row++;
		}
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
