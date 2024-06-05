package polymorphism;

public class Footbal extends Sports
{
	public void play()
	{
		System.out.println("Football Available");
	}
	
	public static void main(String args[])
	{
		Sports obj;                    //upcasting
		obj = new Sports();
	    obj.play();
		obj = new Cricket();
		obj.play();
		obj = new Footbal();
		obj.play();
	}

}
