package inheritance;

public class Car extends Vehicle{
	int carspeed=80;
	
	public void show()
	{
	System.out.println("Car is going at a speed of " +speed);
	}
	
	
	public static void main(String[] args) {
	Car c= new Car();
	c.run();
	c.show();
	System.out.println(c.carspeed);
	System.out.println(c.speed);
	

	}

}
