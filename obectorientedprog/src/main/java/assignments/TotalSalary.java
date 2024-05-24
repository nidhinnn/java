package assignments;

public class TotalSalary extends SalaryCalculion
{
	double total=bp+bonus+hra-pf-deduction;
	
	public void inhand()
	{
		System.out.println("Total inhand Salary= " +total);
	}

	public static void main(String[] args) 
	{
		System.out.println("Salary slip");
		
		TotalSalary ts= new TotalSalary();
		ts.salary();
		ts.calculation();
		ts.inhand();

	}

}