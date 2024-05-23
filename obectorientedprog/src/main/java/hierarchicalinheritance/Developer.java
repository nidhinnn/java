package hierarchicalinheritance;

public class Developer extends Employee {
	String developername= "Anooj";
	int developersalary=75000;
	
	public void developerdetails()
	{
		System.out.println("Name of developer : " +developername);
		System.out.println("Salary of developer : " +developersalary);
	}

}
