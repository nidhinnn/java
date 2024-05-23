package hierarchicalinheritance;

public class Tester extends Employee{
	String testername= "Arun";
	int testeralary=50000;
	
	public void testerdetails()
	{
		System.out.println("Name of tester : "+testername);
		System.out.println("Salary of tester : "+testeralary);
	}

	public static void main(String[] args) {
		
		Tester td= new Tester();
		td.testerdetails();
		td.managerdetails();
		
		Developer d= new Developer();
		d.developerdetails();
		
	}

}
