package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(2);
		v.add(1,"hello");
		
		Enumeration enums = v.elements();
		while(enums.hasMoreElements())
			System.out.println(enums.nextElement());
		
		Iterator i = v.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
}
