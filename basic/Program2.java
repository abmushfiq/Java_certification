package basic;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number series  : ");
		int a = scan.nextInt();
		int count = 0;
		int div =1;
		while (div<= a) {
			if(a%div == 0) {
				System.out.println(div);
				count++;
			}
			div = div+1;
		
		}
		System.out.println("conunt : "+count);

	}

}
