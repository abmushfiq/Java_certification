package Strings;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String) o1;
		String s2 = (String) o2;
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1>l2)
			return 999;
		
		else if(l1<l2)
			return -123;
		
		
		return 0;
	}

}
