package scenario3;

public abstract class FactoryDemo extends SmartPhone {
	
	private boolean isOriginalPiece;
	private static int price ;

	public FactoryDemo() {
		this.isOriginalPiece = false;
		this.price = 0;
	}
	
	public abstract void verifyFingerPrint();
	public abstract void providePattern();
	
	
	public void browse() {
		System.out.println("Factory Demo browsing");
		
	}

	public boolean isOriginalPiece() {
		return isOriginalPiece;
	}

	public void setOriginalPiece(boolean isOriginalPiece) {
		this.isOriginalPiece = isOriginalPiece;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		FactoryDemo.price = price;
	}
	
	
	
	
	
	
}
