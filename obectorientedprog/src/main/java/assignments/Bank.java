package assignments;
import java.util.*;

class Bank 
{
	private int pin;
	
	public void setpin(int pin)
	{
		this.pin=pin;
	}
    public int getpin()
    {
    	return pin;
    }
    
    public void checkpin()
    {
    	if(pin == 1001 || pin == 1234 || pin == 1212)
    	{
    		System.out.println("Valid pin ");
    		System.out.println("you can withdraw cash");
    		
    	}
    	else
    	{
    		System.out.println("Invalid pin ; Enter valid pin ");
    	}
    }

}
