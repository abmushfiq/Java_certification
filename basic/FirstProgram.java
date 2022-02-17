package basic;

import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
	
		int f =-1;
		int s =1;
		int count =1;
		int t=0;
		
		while (count <= 8) {
			t=f+s;
			System.out.println(t+" ");
			f= s;
			s =t;
			count = count+1;
		}
		
	}

}
