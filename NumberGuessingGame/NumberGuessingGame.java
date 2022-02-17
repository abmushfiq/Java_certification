package NumberGuessingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	private static Scanner scan = new Scanner(System.in);
	private static int[] result = new int[4];
	private static int[] random = new int[4];
	private static int[] user = new int[4];
	
	public static void main(String[] args) {
		randomNumGenarate(random);
		
		
		boolean flag = true;
		while(flag) {
			System.out.println("Enter your 4 digit Number");
			int userInput = scan.nextInt();
			
			
				if(userInput>999 && userInput<10000) {
					putArray(userInput, user);
					compare(user, random);
					
					boolean isFinished = Arrays.equals(random,result);
					
					if(isFinished) {
						System.out.println("--------------your number is find, well guess-----------");
						flag = false;
						break;
					}else {
						System.out.println("countinue your game");
					}
					
					
				}else {
					System.out.println("input valid number ");
				}
			
			
			
			
		}
		
		
		

	}
	
	
	public static void randomNumGenarate(int[] arr) {
		Random rand = new Random(); 
		for(int i = 0 ; i< arr.length; i++) {
			int n = rand.nextInt(10);
			arr[i] = n;
		}
		
		linearSearch(arr);
	}
	
	
	public static void linearSearch(int[] arr) {
		for(int i=0; i<arr.length; i++ ) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					randomNumGenarate(random);
				}
			}
		}
		
		
	}
	
	public static void putArray(int a, int[] arr) {
		
		for(int i =  arr.length-1; i>=0; i--) {
			int b = a%10;
			a = a/10;
			arr[i] = b;	
		}
	}
	
	

	public static void compare(int[]user, int[]guess) {
		for(int i =0; i<user.length; i++) {
			boolean flag = true;
			for(int j= 0 ; j< guess.length; j++) {
				if(guess[j] == user[i]) {
					if(i == j ) {
						result[i]= user[i];
						System.out.println(user[i] +" = c ");
						flag = false;
						break;
						
					}else {
						System.out.println(user[i]+" = p");
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println( user[i]+ " = x");
			}
			
		}
		
	}

}
