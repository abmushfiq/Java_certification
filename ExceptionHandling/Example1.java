package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		int no1=100, no2 = 10;
		
		
		try {
			System.out.println(no1/no2);
			int[] ar = new int[no2];
		}catch(ArithmeticException ae) {
			System.out.println("check ");
		}catch(NegativeArraySizeException nase) {
			System.out.println("nagative");
		}

		
		catch(Exception e) {
			System.out.println("went wrong ");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}

}
