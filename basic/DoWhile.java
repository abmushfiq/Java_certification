package basic;

public class DoWhile {

	public static void main(String[] args) {
		int no1= 10;
		int no2 = 12;
		
		int big = no1>no2? no1:no2;
		while(true) {
			if(big%no1 ==0 && big%no2==0)
			{
				System.out.println("LCM is "+ big);
				break;
			}
			big++;
		}
		
		

	}

}
