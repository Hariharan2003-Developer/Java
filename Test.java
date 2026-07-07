package learnExceptionDemo;

public class Test {

	public static void main(String[] args) {
		
		PasswordException pe = new PasswordException();
		try {
			pe.verifyPassword("Hariharan");
		} catch (PasswordException e) {
			
			System.out.println("Invalid Password");
			
		}

	}

}
