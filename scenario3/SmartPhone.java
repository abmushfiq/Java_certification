package scenario3;

public abstract class SmartPhone {
	
	public abstract int call(int seconds);
	public abstract void sendMessage();
	public abstract void receiveCall();
	
	
	public SmartPhone()
	{
		System.out.println("Smartphone under development");
	}
	
	
	public void browse() {
		System.out.println("SmartPhone browsing");
	}

	
}
