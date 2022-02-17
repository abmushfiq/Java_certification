package Strings;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;

public class ListDemo {
	
	 java.util.ArrayList toppings;
	 
	 String brand;

	 public ListDemo(String brand) {
			this.brand = brand;
		}
	 
	 public String toString() {
		 return this.brand;
	 }

	public static void main(String[] args) {
		
//		java.util.ArrayList al = new  java.util.ArrayList();
//		al.add("abcd");
//		al.add('c');
//		al.add(true);
//		al.add(5);
//		al.add(5.2f);
//		System.out.println(al);
//		
//		ArrayList al2 = new ArrayList();
//		al2.add("ffff");
//		al2.add("up");
//		System.out.println(al2);
//		
//		al2.add(al);
//		
//		System.out.println(al2);
//		
//		al2.addAll(al);
//		System.out.println(al2);
//		
//		al2.retainAll(al);
//		System.out.println(al2);
//		
//		List al3 = al.subList(0, 2);
//		System.out.println(al);
		
		
		
		
		ListDemo ld1 = new ListDemo("Dell");
		ListDemo ld2 = new ListDemo("Hp");
		
		

		ArrayList mu = new ArrayList();
		mu.add(ld1);
		mu.add(ld2);
		mu.add(10);
		mu.add('c');
		mu.add(true);
		mu.add(16.45f);
		
		for(Object o :  mu)
		{
			try {
				ListDemo i = (ListDemo) o;
				System.out.println(i);
			}catch(ClassCastException cce)
			{
				
			}
		}
	}

}
