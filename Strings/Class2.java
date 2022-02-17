package Strings;

public class Class2 {

	public static void main(String[] args) {
		
		Class2 od = new Class2();
		
		String s1 = "monday tuesday wednesday thursday friday";
		// ouput want to : MONDAY tuesday WEDNESDAY thursday FRIDAY
		
		String[] s2 = s1.split(" ");
		od.changeCase(s2);

	}

	private void changeCase(String[] s2) {
		
		for(int i =0; i<s2.length ; i++) {
			if(i%2 == 0) {
				System.out.println(s2[i]);
			}else {
				System.out.println(s2[i].toUpperCase());
			}
		}
		
	}

}
