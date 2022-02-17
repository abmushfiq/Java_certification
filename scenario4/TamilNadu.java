package scenario4;

public class TamilNadu extends SouthIndia {

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TamilNadu che = new TamilNadu("Modi");
		System.out.println( India.capital);
		che.livingStyle();
		che.cultivate();
		
		System.out.println("----------------------------------------");
		
		SouthIndia si = new TamilNadu("Modi");
		si.capital = "chennai";
		si.livingStyle();
		si.cultivate();
		
		
	}
	
	
	
	public void cultivate() {
		System.out.println("Rice and Sugar cane cultivation");
	}
	
	public void livingStyle() {
		System.out.println("Above Average development");
	}

	@Override
	public void speakLanguage() {
		System.out.println("Tamil");
		
	}

	@Override
	public void eat() {
		System.out.println("Chappathi");
		
	}

	@Override
	public void dress() {
		System.out.println("vetti dress");
		
	}

}
