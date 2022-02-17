package PatternProgram;

public class AllPattern {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
		pattern7();
		pattern8();
		pattern9();
		pattern10();
		pattern11();
		pattern12();
		pattern13();
		pattern14();
		pattern15();
		pattern16();
		pattern17();
		pattern18();

	}
	
	
	public static void pattern1() {
		System.out.println(1);
		for(int row =1; row<=4 ; row++) {
			for(int col =1 ; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern2() {
		System.out.println(2);
		for(int row =1; row<=4 ; row++) {
			
			for(int col =4 ; col>=row; col--){
				System.out.print("* ");
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern3() {
		System.out.println(3);
		for(int row =1; row<=4 ; row++) {
			
			for(int col1 =4 ; col1>row; col1--) {
				System.out.print("  ");
			}
			
			for(int col2 =1 ; col2<=row; col2++){
				System.out.print("* ");
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern4() {
		System.out.println(4);
		for(int row =1; row<=4 ; row++) {
			
			for(int col1 = 1; col1<row ; col1++) {
				System.out.print("  ");
			}
			
			for(int col2=4; col2>=row; col2--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern5() {
		System.out.println(5);
		for(int row =1; row<=4 ; row++) {
			
			
			for(int col =1 ; col<=4; col++) {
				if(row==1 || col ==1 || row == 4 || col ==4) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern6() {
		System.out.println(6);
		for(int row =1; row<=4 ; row++) {
			
			
			for(int col =1 ; col<=4; col++) {
				if( col ==1 || row == 4 || col ==4) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern7() {
		System.out.println(7);
		for(int row =1; row<=4 ; row++) {
			
			
			for(int col =1 ; col<=4; col++) {
				if( row==1 || col ==1 || row == 4 ) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern8() {
		System.out.println(8);
		for(int row =1; row<=4 ; row++) {
			
			
			for(int col =1 ; col<=4; col++) {
				
				
				 if ((col==4 && row==4) || (col==4&& row ==1) ) {
					System.out.print("  ");
				}
				 else if(row==1 || col ==1 || row == 4 || col ==4 ) {
					System.out.print("* ");
				}
				
				
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern9() {
		System.out.println(9);
		int n =1;
		for(int i =1; i<=2; i++) {
			for(int row =n; row<=4 ; row++) {
				
				for(int col =1 ; col<=4; col++) {
					
					
					 if ((col==4 && row==4) || (col==4&& row ==1) ) {
						System.out.print("  ");
					}
					 else if(row==1 || col ==1 || row == 4 || col ==4 ) {
						System.out.print("* ");
					}
					
					
					else {
						System.out.print("  ");
					}
						
				}
				System.out.println("");
				
				
			}
			n++;
		}
		
		
		System.out.println("------------------------------");
	}
	
	
	public static void pattern10() {
		System.out.println(10);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if(row == 1 || col==1 || row==5 || row==3)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern11() {
		System.out.println(11);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if(row == 1 || col==1 ||  row==3)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern12() {
		System.out.println(12);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if(row == 1 || col==3 ||  row==5)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern13() {
		System.out.println(13);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if( col==1 ||  row==5)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern14() {
		System.out.println(14);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if( col==1 ||  row==3 || col ==5)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern15() {
		System.out.println(15);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if( col==3 ||  row==1 || (col==1&& row ==5 || col==2 && row ==5))
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	public static void pattern16() {
		System.out.println(16);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if( col ==1&& row==2 || row ==1 || row ==3 || col==5 && row==4|| row==5)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern17() {
		System.out.println(17);
		for(int row =1; row<=5 ; row++) {
			
			
			
			for(int col =1 ; col<=5; col++) {
				if( col==1 || row == 1|| row ==3 || row==2 && col == 5)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
				
				
			}	
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void pattern18() {
		System.out.println(18);
		for(int row =1; row<=5 ; row++) {
			for(int col1 =5 ; col1>row; col1--) {
				System.out.print("  ");
				
			}
			
			
			for(int col2 =1; col2 <= row ; col2++) {
				if(col2 == row || col2 == 5) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	
	

}

