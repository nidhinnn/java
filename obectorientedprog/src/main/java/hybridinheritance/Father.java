package hybridinheritance;

public class Father extends Grandfather{
	String fathername= "Rajan";
	int fatherage= 50;
	
	public void fatherdetails()
	{
		System.out.println("Name of grandfather : " +fathername);
		System.out.println("Age of grandfather : "+fatherage);
	}

}
