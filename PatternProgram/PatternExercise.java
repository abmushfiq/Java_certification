package PatternProgram;

public class PatternExercise {

	public static void main(String[] args) {
		pattern1(4);
		pattern2(4);
		pattern3(4);
		pattern4(4);
		pattern5(4);

	}
	
	
	//Pattern1
	static void pattern1(int n) {
		System.out.println("1.");
		for (int row =1; row<=n; row++) {
			//for every row, run the clo
			
			for(int col=1;col<=n; col++) {
				System.out.print("* ");
			}
			//when one row is printed, we need to add a newline
			System.out.println();
			
		}
		System.out.println("------------------------------");
	}
	
	
	
	
	//pattern2
	static void pattern2(int n) {
		System.out.println("2.");
		for (int row =1; row<=n; row++) {
			//for every row, run the clo
			
			for(int col=1;col<=row; col++) {
				System.out.print("* ");
			}
			//when one row is printed, we need to add a newline
			System.out.println();
			
		}
		System.out.println("------------------------------");
	}
	
	//pattern3
		static void pattern3(int n) {
			System.out.println("3.");
			for (int row =1; row<=n; row++) {
				//for every row, run the clo
				
				for(int col=n;col>=row; col--) {
					System.out.print("* ");
					
				}
				//when one row is printed, we need to add a newline
				System.out.println();
				
			}
			System.out.println("------------------------------");
		}
		
		//pattern4
				static void pattern4(int n) {
					System.out.println("4.");
					for (int row =1; row<=n; row++) {
						//for every row, run the clo
						
						
						for(int col1=1; col1<row; col1++) {
							System.out.print("  ");
						}
						
						for(int col2=n; col2>=row; col2--) {
							System.out.print("* ");
						}
						//when one row is printed, we need to add a newline
						System.out.println();
						
					}
					System.out.println("------------------------------");
				}
				
				
				//pattern5
				static void pattern5(int n) {
					System.out.println("5.");
					for (int row =1; row<=n; row++) {
						//for every row, run the clo
						
						
						for(int col1=3; col1>=row; col1--) {
							System.out.print("  ");
						}
						
						for(int col2=1; col2<=row; col2++) {
							System.out.print("* ");
						}
						//when one row is printed, we need to add a newline
						System.out.println();
						
					}
					System.out.println("------------------------------");
				}
				
				
	

}
