package basic;

public class swap3numbers {

	public static void main(String[] args) {
		int a = 10;   //30
		int b = 20;   //10
		int c = 30;   //20
		
		a = a+b+c;  // a=60
		
		b = a-b-c;  // a=60, b=20, c=30 -------> b=10
		
		c = a-b-c;  // a=60, b=10, c=30 -------> c=20
		
		a = a-b-c;   // a=60, b=10, c=20 -------> a=30
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
