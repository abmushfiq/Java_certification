package Collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("b");
		h.add("c");
		h.add("D");
		h.add("z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("z"));//false
		System.out.println(h);
		

	}

}
