package Object;

public class Mobile {
	
	String brand;
	int price;

	public Mobile(String brand, int price) {
		this.brand= brand;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Redme",10000);
		Mobile m2 = new Mobile("Oneplus",10000);
		Mobile m3 = new Mobile("Apple",40000);

		System.out.println(m1.equals(m2));
		System.out.println(m1);
		System.out.println(m2);
	}
	
	public int hashCode() {
		return this.price;
	}
	
	public boolean equals(Object ob)
	{
		Mobile m1 = this;
		Mobile m2 = (Mobile)ob;
		
		if(m1 == m2)
			return true;
		else
			return false;
	}

}
