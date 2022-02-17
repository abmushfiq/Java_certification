package Strings;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		String[] no = {"abcd", "efg", "bcdef"};
		//sorting and searching
		//for each loop
		
		System.out.println("Befor sorting");
		for(String num: no) {
			System.out.println(num);
		}
		System.out.println("-----------------------");
		
	Arrays.sort(no);
	
	
	System.out.println("After sorting");
	for(String num: no) {
		System.out.println(num);
	}
	System.out.println("-----------------------");
	
	
	ComparatorDemo cd = new ComparatorDemo();
	Arrays.sort(no, cd);
	System.out.println("After 2nd sorting");
	for(String num: no) {
		System.out.println(num);
	}
	System.out.println("-----------------------");
	
	

	}

}
