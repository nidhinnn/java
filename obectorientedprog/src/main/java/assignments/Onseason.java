package assignments;

public class Onseason
{
	public void purchase(double purchaseamount)
	{
		System.out.println("Onseason Purchase");
		System.out.println("Your purchase amount " +purchaseamount);
		System.out.println("you will be having 40% discount ");
		double billamount =purchaseamount-(purchaseamount*.40);
		System.out.println("Your bill amount after discount = " +billamount);
	}

}