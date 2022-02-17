package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Naveen");
		// Thread Safe, synchronized
		
		System.out.println(sb.hashCode());
		sb.append("joshva");
		System.out.println();

	}

}
