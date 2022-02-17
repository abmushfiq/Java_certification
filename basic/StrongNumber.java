package basic;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145;
		int num1 = num;
		int total = 0;
		
		while(num > 0) {
			int  a = num%10;
			int fnum = 1;
			while(a > 0) {
				fnum = fnum *a;
				a--;
				
			}
			num=num/10;
			total = total+fnum;
		}
		if(total == num1) {
			System.out.println("Strong number");
		}else {
			System.out.println("not strong number");
		}

	}

}
