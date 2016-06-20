import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class CollectionsClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a = new ArrayList();
		a.add("Gayathri");
		a.add("Mamatha");
		System.out.println(a);
		List b = new ArrayList();
		b.addAll(a);
		System.out.println(b);
		System.out.println(a.get(0));
		System.out.println(a.indexOf("Mamatha"));
		a.add(2, "Mamatha");
		System.out.println(a.lastIndexOf("Mamatha"));
		ListIterator li = a.listIterator();
		while(li.hasNext()){
			System.out.println("My name is:"+li.next());
			System.out.println(li.nextIndex());
		}
		while(li.hasPrevious()){
			System.out.println("Back:"+li.previous());
		}
		li.remove();
		System.out.println(a);
		System.out.println(li.nextIndex());
		System.out.println(li.previousIndex());
		a.set(0, "Zumba");
		System.out.println(a);
	

	}

	public static void sort(List<String> strList) {
		// TODO Auto-generated method stub
		
	}

}
