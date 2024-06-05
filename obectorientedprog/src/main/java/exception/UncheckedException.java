package exception;

public class UncheckedException {
	
	public static void display() throws ArithmeticException
	{
		throw new ArithmeticException("Exception Occured");
	}

	public static void main(String[] args) {
		UncheckedException.display();

	}

}
