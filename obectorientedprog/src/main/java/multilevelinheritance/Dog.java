package multilevelinheritance;

public class Dog extends Animal {
   int age=10;
   
   public void sleep()
   {
	   System.out.println("Dog is sleeping");
	   System.out.println("Age of the dog is " +age);
   }
}
