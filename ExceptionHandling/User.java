package ExceptionHandling;

public class User {

	public static void main(String[] args) {
		PasswordException pe = new PasswordException();
		try {
			pe.check(123);
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
