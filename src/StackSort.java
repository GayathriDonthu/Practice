import java.util.*;
public class StackSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(45);
		s1.add(34);
		s1.add(2);
		s1.add(14);
		System.out.println("Initial stack:"+s1);
		System.out.println("Final stack:"+sortStack(s1));

	}
	
	public static Stack<Integer> sortStack(Stack<Integer> s1){
		Stack<Integer> s2 = new Stack<Integer>();
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!s2.isEmpty() && s2.peek() > temp){
				s1.push(s2.pop());	
			}
		s2.push(temp);
		System.out.println("Temporary stack"+s2);
		}
	return s2;
	}
}
