package scenario1;

public class Trainer {
	String dept = "java";
	String institute = "pailagam";
	private int salary ;
	
	public Trainer(String dept, String institute) {
		this.dept = dept;
		this.institute = institute;
		this.salary = 10000;
	}

	public int getSalary() {
		return salary;
	}


	public void training() {
		System.out.println("tarining !");
	}
	
	
	public static void main(String[] args) {
		Trainer trainerKumar = new Trainer("CSE","payilagam");
		trainerKumar.training();
		System.out.println(trainerKumar.getSalary());
	}
	
	

}
