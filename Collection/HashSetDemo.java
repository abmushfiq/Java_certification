package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		System.out.println(hs);
		//Hashing Algorithms
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(100);
		hs.addAll(al);
		System.out.println(hs);
		
		// linked hash set maintain insertion order
		System.out.println("--------------------------");
		LinkedHashSet hs1 = new LinkedHashSet();
		hs1.add(50);
		hs1.add(10);
		hs1.add(30);
		hs1.add(10);
		System.out.println(hs1);
		//Hashing Algorithms
		
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(100);
		hs1.addAll(al);
		System.out.println(hs1);
		
		// Tree set maintain sorting order
		// blanced tree -- > Data Structure
				System.out.println("--------------------------");
				TreeSet hs2 = new TreeSet();
				hs2.add(50);
				hs2.add(10);
				hs2.add(30);
				hs2.add(10);
				System.out.println(hs2);
				//Hashing Algorithms
				
				ArrayList al2 = new ArrayList();
				al2.add(100);
				al2.add(200);
				al2.add(100);
				hs2.addAll(al);
				System.out.println(hs2);
				
				
				
		// Duplicate element finding 
		ArrayList al3 = new ArrayList();
		al.add(5);
		al.add(45);
		al.add(35);
		
		String s="abcdefg";
		StringBuffer sb = new StringBuffer();
		
		
		
		
	}

}
