package basic;

import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st numbe  : ");
		int a = scan.nextInt();
		
		System.out.println("Enter 2nd number  : ");
		int b = scan.nextInt();
		
		int last = -1;
		int div =1;
		int small =0;
		small = a<b? a:b; 
		
		while (div<= small) 
		{
			if(a%div == 0 && b%div == 0) {
				last = div;
				
			}
			div = div+1;
		
		}
		if (last >0)
			System.out.println("Gcd : "+ last);

	}

}
