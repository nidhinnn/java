package multilevelinheritance;

public class BabyDog extends Dog {
	String colour="Black and Tan";
	
	public void colour()
	{
		System.out.println("The colour of the dog is " +colour);
	}

	public static void main(String[] args) {
		
		BabyDog bd= new BabyDog();
		bd.eat();
		bd.sleep();
		bd.colour();

	}

}
