package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Apple");
		l.add("orange");
		l.add(123);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		List<String> l2 = new ArrayList();
		l2.add("pen");
		l2.add("pencil");
		System.out.println(l2);
		System.out.println(l2.contains(10));
		l2.remove("pen");
		System.out.println(l2);
		
		
		System.out.println("Non generic collection");
		ArrayList al = new ArrayList();
		al.add("a");
		al.add(123);
		al.add("bag");
		al.add(null);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
		System.out.println("generic collection");
		ArrayList <Integer> al1 = new ArrayList();
		al1.add(1);
		al1.add(2);
		System.out.println(al1);
		
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		
		System.out.println("List using for each loop");
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		
		System.out.println(l.get(0));
		System.out.println(l.set(2, "jack"));
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		l.addAll(l2);
		System.out.println(l2);
		
		l.removeAll(l2);
		System.out.println(l2);
		
		System.out.println("Iterator");
		
		Iterator <String> i =l2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(l2);
		

	}

}
