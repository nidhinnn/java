package superkeyword;

public class Baby extends AnimalSuper{
  String colour= "black";
  
  public void name() 
  {
	  super.name();
	  super.age();
	  
	System.out.println(colour);
	System.out.println(super.colour);
  }
	public static void main(String[] args) {
		Baby b= new Baby();
		b.name();

	}

}
