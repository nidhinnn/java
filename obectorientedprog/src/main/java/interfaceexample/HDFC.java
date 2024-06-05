package interfaceexample;

public class HDFC implements RBI
{ 
	public void recurringdeposit()
	{
		int amount=20000;
		int duration=2;
		double intrest= amount*duration*0.3;      //30% intrest
		double finalamount= amount+intrest;
		
		System.out.println("Deposited amount = " +amount);
		System.out.println("Duration in years " +duration);
		System.out.println("Simple Intrest rate = " +intrest);
		System.out.println("Final amount after 2 years = " +finalamount);
	}

	public static void main(String[] args)
	{
		HDFC h = new HDFC();
		h.recurringdeposit();

	}

}
