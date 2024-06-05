package polymorphism;

public class PolyExam2 extends PolyExample1
{
	public void display(int e, int f)
	{
		super.display(10, 20);
		int z= e+f;
		System.out.println("Sum = " +z);
	}
	
	public static void main(String args[])
	{
		PolyExample1 pe =new PolyExam2();    //upcasting
		pe.display(5, 6);
	}

}
