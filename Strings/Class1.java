package Strings;

public class Class1 {



	
	public void print(){
		System.out.println();
	} 

	public Class1 add() {
		return this;
	}
	
	public static void main(String[] args) {
		Class1 cls = new Class1();
		cls.add().print();
		
	}

}
