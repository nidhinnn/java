package abstraction;
/* Let‟s first create the superclass Employee and define a method called  
calculateSalary() as an abstract method. The Contractor class inherits  
all properties from its parent Employee but have to provide its own  
implementation of calculateSalary() method and multiply the value  
of payment per hour with given working hours. The  
FullTimeEmployee also has its own implementation of  
calculateSalary()method. In this case we just multiply by constant 8  
hours.*/
public class Contractor extends Employee
{
	public void calculatesalary()
	{
		System.out.println("Part time Employee");
		int workinghours=5;
		int days=6;
		int salaryperday=1000;
		int salary=workinghours*days*salaryperday;
		System.out.println("Salary of part time Employee = " +salary);
	}
}
