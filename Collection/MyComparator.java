package Collection;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String I1 = (String) o1;
		String I2 = (String) o2;
		
		return I2.compareTo(I1);
			
		
		
	}

}
