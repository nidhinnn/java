package exception;

public class CustomeException 
{
	public static void validateage(int age) throws LicenseException
	{
		if (age<18)
		{
			throw new LicenseException("Not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
		
	}

	public static void main(String[] args) {
		
		try 
		{
			CustomeException.validateage(15);
		}
		catch(LicenseException l)
		{
			System.out.println(l);
		}

	}

}
