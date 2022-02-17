package Strings;

public class StringImmutable {

	public static void main(String[] args) {
		
		String mother1 = "tamil";
		System.out.println(mother1.hashCode());
		
		String mother2 = "tamil";
		System.out.println(mother2.hashCode());
		
		String mother3 = "tamil";
		System.out.println(mother3.hashCode());
		
		mother1 = "telugu";
		System.out.println(mother1.hashCode());

	}

}
