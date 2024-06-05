package abstraction;

public class Contractor2 extends Employee
{
	public void calculatesalary()
	{
		System.out.println("Full time Employee");
		final int workinghours=8;
		int days=7;
		int salaryperday=2000;
		int salary=workinghours*days*salaryperday;
		System.out.println("Salary of part time Employee = " +salary);
	}

	public static void main(String[] args) 
	{
		Contractor2 cc= new Contractor2();
		cc.calculatesalary();
		
		Contractor c = new Contractor();
		c.calculatesalary();
		

	}

}
