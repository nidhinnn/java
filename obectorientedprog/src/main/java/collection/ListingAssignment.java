package collection;

import java.util.ArrayList;
import java.util.List;

public class ListingAssignment {

	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add("red");
		l.add("blue");
		l.add("green");
		l.add("yellow");
		l.add("white");
		
		System.out.println(l);
		
		System.out.println(l.get(4));
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		l.remove(3);
		System.out.println(l);
		
		System.out.println(l.contains("red"));
		
		
	}

}
