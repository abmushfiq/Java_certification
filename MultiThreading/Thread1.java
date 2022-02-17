package MultiThreading;

public class Thread1 extends Thread {

	public void run()
	{
//		try {
//			Thread.sleep(1000); // static
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		for(int i = 1; i <=5; i++)
		{
			Thread.yield();
			System.out.println("Thread1 "+i);
		}
		
	}
}
