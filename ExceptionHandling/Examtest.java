package ExceptionHandling;

public class Examtest {

	public static void main(String args[]) {
		try {
			System.out.println('A');
			throw new ArrayIndexOutOfBoundsException();
			
		}catch(RuntimeException r) {
			System.out.println('B');
			throw r;
		}catch (Exception e) {
			System.out.println('C');
		}finally {
			System.out.println('D');
		}

	}

	
		
	

}
