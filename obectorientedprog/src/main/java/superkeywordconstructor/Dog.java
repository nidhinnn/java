package superkeywordconstructor;

public class Dog extends Animal
{
	String breed="Labrador";
	
	public Dog(String colour)
	{
		super(5);
		System.out.println("Colour of dog : " +colour);
		
	}
	
	
	public void Details()
	{
		super.name();
		super.doing();
		System.out.println("Dog is sleeping");
		System.out.println(breed);
		System.out.println(super.breed);
	}

	public static void main(String[] args)
	{
		Dog d= new Dog("White");
		d.Details();


	}

}
