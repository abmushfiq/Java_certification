package Collection;

public class CompareToDemo {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z")); //-25
		System.out.println("Z".compareTo("K")); //15
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null)); // RE: NullPointerException

	}

}
