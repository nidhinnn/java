package assignments;

public class SalaryCalculion extends BasicPay
{
	double hra= bp*0.05;
	double pf= bp*0.2;
	
	public void calculation()
	{
		System.out.println("Human resourses allowance = " +hra);
		System.out.println("Provident fund = " +pf);
		
	}

}