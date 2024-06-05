package assignments;

public class ReverseThis 
{
	int a=12345;
	
	public ReverseThis()
	{
		this.a=a;
		int num = a;
		int reverse =0;
		while(num !=0)
		{
			int rem=num%10;
			reverse = reverse*10+rem;
			num=num/10;
			
		}
		
	}
	
	public void display()
	{
		System.out.println("Number = " +a);
		//System.out.println("Reversed number = " +reverse);
		//this.ReverseThis();
		
	}

	public static void main(String[] args) 
	{
	

	}

}
