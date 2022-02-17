package scenario3;

public class Samsung extends FactoryDemo {
	
	
	public Samsung() {
		super();
	}
	
	public static void main(String[] args) {
		
		Samsung sam = new Samsung();
		sam.setPrice(5000);
		System.out.println(sam.getPrice());
		sam.verifyFingerPrint();
		sam.call(12);
		
	}
	
	

	@Override
	public void verifyFingerPrint() {
		System.out.println("verify finger print");
		
	}

	@Override
	public void providePattern() {
		System.out.println("pettern verify");
		
	}

	@Override
	public int call(int seconds) {
		System.out.println("second : "+ seconds);
		return seconds;
	}

	@Override
	public void sendMessage() {
		System.out.println("sending msg");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("call recieved");
		
	}

}
