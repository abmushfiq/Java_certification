package Object;

public class ObjectClass {

	public static void main(String[] args) {
		
		ObjectClass lib = new ObjectClass();
		System.out.println(lib);
		System.out.println(lib.hashCode());
		
		ObjectClass lib2 = new ObjectClass();
		System.out.println(lib.equals(lib2));

	}
	
	
	public String toString() {
		return "hi";
	}
	
	public int hashCode() {
		return 123;
	}
	
	public boolean equals(Object ob) {
		ObjectClass l1 = this;
		ObjectClass l2 = (ObjectClass) ob;
		
		System.out.println("L1 HC : "+ l1.hashCode());
		System.out.println("L2 HC : "+ l2.hashCode());
		
		int hc1 = l1.hashCode();
		int hc2 = l2.hashCode();
		if(hc1==hc2) {
			return true;
		}else {
			return false;
		}
		
	}

}
