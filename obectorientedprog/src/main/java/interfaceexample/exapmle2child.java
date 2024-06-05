package interfaceexample;

public class exapmle2child implements example1
{
	public void print()
	{
		System.out.println("print");
		
	}
	
	public void display()
	{
		System.out.println("display");
		
	}
	
	public static void main(String args[])
	{
		example1 obj =new exapmle2child();
		obj.display();
		obj.print();
	}

}
