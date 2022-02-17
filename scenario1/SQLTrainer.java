package scenario1;

public class SQLTrainer extends Trainer {
	
	public SQLTrainer() {
		super("CSE","payilagam");
	}

	public static void main(String[] args) {
		
		SQLTrainer ram = new SQLTrainer();
		ram.training();
		System.out.println(ram.institute);
		System.out.println(ram.dept);
		System.out.println(ram.getSalary());
		

	}

}
