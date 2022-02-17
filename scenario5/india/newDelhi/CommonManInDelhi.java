package scenario5.india.newDelhi;

import scenario5.tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {

	public static void main(String[] args) {
		CommonManInDelhi per1 = new CommonManInDelhi();
		per1.dontGoByDieselVehicle();
		per1.goByBicycle();
		per1.goByDieselVehicle();

	}

	@Override
	public void dontGoByDieselVehicle() {
		System.out.println("Dont go by deisal vehicle");
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("wear helmet when go by bicycle");
		
	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("go to diesal vehicle");
		
	}

}
