package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List l = new ArrayList();
		int[] a = {1,2,3,4,5};
		for(int i = 0; i < 5; i++)
			l.add(a[i]);
		System.out.println(l);
		
		Iterator i = l.iterator();
		i.forEachRemaining(l::add);
		
		
		
		
		
	}
}
