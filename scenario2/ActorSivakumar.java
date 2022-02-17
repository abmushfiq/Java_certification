package scenario2;

public class ActorSivakumar implements Actor {
	
	private int age;
	private String usingCarModel;
	static String address = "Coimbatore";
	
	
	
	

	public ActorSivakumar(int age, String usingCarModel) {
		this.age = age;
		this.usingCarModel = usingCarModel;
	
	}

	public static void main(String[] args) {
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		System.out.println(as.address);
		as.speaking();
		as.act();
		as.dance();
		as.sing();
		
		System.out.println("--------------------------------------------------------------------");
		Actor as1 = new ActorSivakumar(65,"Audi Car");
		System.out.println(as1.address);
		// as1.speaking();  cant access because dynamic bynding
		as1.act();
		as1.dance();
		as1.sing();
		
		
		
	}
	
	public void speaking() {
		System.out.println("Sivakumar speaking");
	}

	@Override
	public void act() {
		System.out.println("Sivakumar style acting");
		
	}

	@Override
	public void dance() {
		System.out.println("Sivakumar style dancing");
		
	}

	@Override
	public void sing() {
		System.out.println("Sivakumar style singing");
		
	}

}
