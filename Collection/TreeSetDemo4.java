package Collection;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		
		System.out.println(t); // reversing oder [ShobaRani, Roja, Ramulamma, RajaKumari, GangaBhavani]

	}

}
