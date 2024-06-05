package assignments;

public class Offseason extends Onseason
{
	public void purchase(double purchaseamount)
	{
		super.purchase(10000);
		System.out.println("Offseason Purchase");
		System.out.println("Your purchase amount " +purchaseamount);
		System.out.println("you will be having 15% discount ");
		double billamount =purchaseamount-(purchaseamount*.15);
		System.out.println("Your bill amount after discount = " +billamount);
	}

	public static void main(String[] args)
	{
		Onseason p= new Offseason();
		p.purchase(5000);
	}

}
