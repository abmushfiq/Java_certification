package basic;

public class Fibanasi {

	public static void main(String[] args) {
		
		int f=-1;
		int s=1;
		
		
		
		
		int count = 0;
		while(count <= 8) {
			int t = f+s;
			System.out.println(t);
			f = s;
			s = t;
			count++;
		}

	}

}
