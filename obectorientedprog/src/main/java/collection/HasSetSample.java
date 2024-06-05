package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetSample {

	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add("Amal");
		set.add("Aravind");
		System.out.println(set);
		
		HashSet <String> set2 = new HashSet();
		set2.add("abcd");
		set2.add("efgh");
		set2.add("ijkl");
		
		System.out.println(set2);
		
		Iterator <String> it = set2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		set2.remove("abcd");
		System.out.println(set2);
		
		System.out.println(set2.size());
		
		set.addAll(set2);
		set2.add("efgh");          //duplicate not possible
		System.out.println(set);
		
		set.removeAll(set2);
		System.out.println(set);
		
	}

}
