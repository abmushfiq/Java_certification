package Two_D_Arrays;

public class Patternin2D {

	public static void main(String[] args) {
		String[][] arr = new String[4][4];
		
		for(int i =0 ; i<arr.length; i++) {
			for(int j=0; j <arr[i].length; j++) {
				if(i<=j) {
					
					arr[i][j]="*";
					
				}
				else {
					
					arr[i][j] = "";
				}
			}
		}
		
		print(arr);

	}
	
	public static void print(String[][] arr) {

		for(int i =0 ; i<arr.length; i++) {
			for(int j=0; j <arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	

}
