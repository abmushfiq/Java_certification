package Collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("b");
		t.add("B");
		t.add("Z");
		t.add("L");
		
		//t.add(new Integer(10)); //  classCastexception
		//t.add(10); // classCastexception
		//t.add(null); // NullPointerException
		System.out.println(t); // [A, B, L, Z, b]

	}

}
