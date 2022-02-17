package scenario5.tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {

	public static void main(String[] args) {
		
		CommonManInChennai per2 = new CommonManInChennai();
		per2.goByDieselVehicle();
		per2.goByBicycle();
		

	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("in chennai go by diesal vehicle");
	}

	@Override
	public void goByBicycle() {
		System.out.println("in chennai go by bicycle");
		
	}

}
