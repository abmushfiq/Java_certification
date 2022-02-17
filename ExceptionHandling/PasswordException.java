package ExceptionHandling;

public class PasswordException extends Exception {
	

	public void check(int no) throws PasswordException
	{
		if(no>999 && no<10000) {
			System.out.println("ok");
		}
		else {
			PasswordException pe = new PasswordException();
			throw pe;
		}
	}
}
