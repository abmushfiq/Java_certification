package basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) { 
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your number : ");
	    int num = scan.nextInt();
	 
	    int total = 0;
	    int temp = 0;
	 
	    while (num > 0) {
	 
	        temp = num%10;
	        if(temp%2 == 0) {
	        	total = (total*10) + temp;
	        }
	        
	        num = num/10;
	 
	    }
	 
	    System.out.println("sum of digits of a number: "+total);
	 
	 
	 
	}

}
