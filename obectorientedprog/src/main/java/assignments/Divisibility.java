package assignments;

public class Divisibility extends Addition{
	
	public void divi()
	{
		super.add();

	if(sum%10==0)
	{
		System.out.println("Sum is divisible by 10");
	}
	else
	{
		System.out.println("Sum is not divisible by 10");
	}
	}
	public static void main(String[] args) 
	{
		Divisibility d = new Divisibility();
		d.divi();

	}


}