package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a =5;
		int b=10;
		int sum =a+b;
		
		try
		{
			int div= sum/0;
			int arr[]=new int[5];
			 arr[8]=10;
		}
		/*catch(ArithmeticException div)
		{
			System.out.println("Division by  zero not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds");
		}*/
		catch(Exception e)
		{
			System.out.println(e);
		
		}
        
		
		System.out.println("Rest of code");
	}

}
