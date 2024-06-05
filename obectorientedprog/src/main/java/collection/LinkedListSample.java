package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList();
		l.add("colours");
		l.add("red");
		l.add("yellow");
		l.add("green");
		l.add(null);
		l.addFirst("different");
		l.addLast("vibgyor");
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		l.remove("green");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		
		
		LinkedList <String> l2 = new LinkedList();
		l2.add("fruits");
		l2.add("apple");
		l2.add("orange");
		l2.add("kiwi");
		System.out.println(l2);
		System.out.println(l2.contains("kiwi"));
		
		
		LinkedList <Integer> l3 = new LinkedList();
		l3.add(111);
		l3.add(222);
		l3.add(333);
		l3.add(444);
		System.out.println(l3);
		
		for(int i = 0; i<l3.size(); i++)
		{
			System.out.println(l3.get(i));
		}
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		System.out.println(l3.get(0));
		System.out.println(l2.set(3, "jerry"));
		System.out.println(l2);
		
		Collections.sort(l2);
		System.out.println(l2);
		
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
