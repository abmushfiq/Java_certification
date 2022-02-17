package PatternProgram;

public class Main {

	public static void main(String[] args) {
		
		
		for(int row=1; row<=5; row++)
	    {

	    for(int num=0; num<row; num++)
	    {
	    System.out.print(num+" "); 
	    }
	    for(int star=5; star>=6-row  ; star--)
	    {
	    System.out.print("* ");
	    }


	    System.out.println(); 
	    }
		
		
		
		
		
		
		
		
		
		
		
//		for(int j = 4; j>=0;j--)
//		{
//		for(int i=1; i<=j; i++)
//		{
//		System.out.print(i + " "); 
//		}
//		
//		for (int i2=1 ;i2<=5-j ; i2++)
//		{
//			System.out.print("* ");
//		}		System.out.println();
//		} 

	}

}
