package interfaceexample;

public class InterfaceClass implements Interface1,Interface2
{
	public void print()
	{
		System.out.println(A);
	}
	
	public void display()
	{
		System.out.println(B);
	}

	public static void main(String[] args) 
	{
		InterfaceClass ic = new InterfaceClass();
		ic.print();
		ic.display();

	}

}
