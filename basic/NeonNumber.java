package basic;

public class NeonNumber {

	public static void main(String[] args) {
		int a = 9;
		int b =a*a;
		int total = 0;
		
		while(b>0) {
			total = total + b%10;
			b = b/10;	
		}
		if (total == a)
		{
			System.out.println("neon number");
		}else {
			System.out.println("not neon number");
		}

	}

}
