package abstraction;

public class abstractionexample2 extends abstractionexample1
{
	public void print()
	{
		System.out.println("implementation");
	}

	public static void main(String[] args) 
	{
		abstractionexample2 obj = new abstractionexample2();
		obj.print();
		obj.display();
		

	}

}
