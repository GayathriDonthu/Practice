package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");
		// first method
		System.out.println("first method");
		Enumeration enums = h.keys();
		while(enums.hasMoreElements())
			System.out.println(h.get(enums.nextElement()));
		
		//second method
		System.out.println("Second method");
		Iterator i= h.entrySet().iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//third method
		System.out.println("third method");
		Set<Integer> s = h.keySet();
		for(int j:s)
			System.out.println(j+": "+h.get(j));
		
		// fourth method
		System.out.println("fourth Method");
		for(Map.Entry<Integer,String> row : h.entrySet())
			System.out.println(row);
	
	}
}
