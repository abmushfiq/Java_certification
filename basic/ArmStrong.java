package basic;

public class ArmStrong {

	public static void main(String[] args) {
		
		int a = 371;
		int a1 = a;
		int total=0;
		
		while (a > 0) {
			int b = a%10;
			
			total = total + (b*b*b);
			a = a/10;
			
		}
		if (a1 == total) {
			System.out.println("Arm Strong Number");
		}else {
			System.out.println("not arm strong number");
		}

	}

}
