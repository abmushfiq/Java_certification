package PatternProgram;

public class Ex1 {

	public static void main(String[] args) {
		int k = 1;
		for(int row = 1; row<7; row=row+2) {
			for(int col=row; col<=k;col=col+2) {
			System.out.print(col+" ");
			
			
			}
			k=k+6;
			System.out.println();
		}
		
	}

}
