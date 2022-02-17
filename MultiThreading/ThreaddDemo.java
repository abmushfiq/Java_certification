package MultiThreading;

public class ThreaddDemo  {

	public static void main(String[] args) {
		
		ThreaddDemo td = new ThreaddDemo();
		Thread1 t = new Thread1();
		System.out.println(t.getState());
		t.start();
//		t.yield();
		//t. start(); //exception
		System.out.println(t.getState());
		
		td.display();
		System.out.println(t.getState());
		
		
		
	}

	private void display() {
		for(int i =1; i<=5; i++) {
			System.out.println("Thread demo"+ i);
		}
		
	}

	
}
