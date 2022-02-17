package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class Samusa {

	public static void main(String[] args) {
		 
	int var = sun();
	System.out.println(var);
	
	}
	
	
	
	public static int sun() {
		try {
			System.out.println("java");
			throw new NumberFormatException();
			
			
			
		}catch(NumberFormatException e1) {
			System.out.println("Exception catch block");
			return 2;
		}finally {
			System.out.println("Finally block");
			
		}
	}
}
