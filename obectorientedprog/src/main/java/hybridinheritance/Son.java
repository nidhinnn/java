package hybridinheritance;

public class Son extends Father{
	String sonname="Raj";
	int sonage=20;
	
	public void sondetails()
	{
		System.out.println("Name of son : "+sonname);
		System.out.println("Age of son : "+sonage);
	}

	public static void main(String[] args) {
		Son s= new Son();
		s.sondetails();
		
		Daughter d= new Daughter();
		d.daughterdetails();
		
		s.fatherdetails();
		s.grandfatherdetails();
		
	}

}
