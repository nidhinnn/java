package exception;

public class ThrowExample 
{
	public static void sum(int a, int b)
	{
		int c=a+b;
		if (c>18)
		{
			throw new ArithmeticException("Arithmetic Exception");
		}
		else
		{
			System.out.println("Sum is not greater");
			
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			ThrowExample.sum(5, 12);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		

	}

}
