package sortedSetExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableClass {

	public static void main(String[] args) {
		/*Student s1 = new Student("Gayathri",23);
		Student s2 = new Student("Mamatha", 24);
		if(s1.compareTo(s2) > 0)
			System.out.println("Gayathri is elder");
		else
			System.out.println("Mamatha is elder");*/
		
		List al = new ArrayList();
		al.add(new Student("Gayathri",25));
		al.add(new Student("Mamatha",24));
		al.add(new Student("Divya", 22));
		
		Collections.sort(al);
		Iterator<Student> i = al.iterator();
		while(i.hasNext()){
		Student st = i.next();
		System.out.println(st.name +" "+st.age);
		}	
		
		
	}

}

class Student implements Comparable<Student>{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student s){
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else 
			return -1;
	}
	
}
