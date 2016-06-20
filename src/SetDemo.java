import java.util.*;


public class SetDemo implements java.io.Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet S = new HashSet();
	    S.add(1);
	    S.add(2);
	    System.out.println(S);
	    Iterator it = S.iterator();
	    while(it.hasNext()){
	    	System.out.println("Element:"+it.next());
	    }
	    
	    System.out.println(S.contains(1));
	    S.clear();
	    System.out.println(S.isEmpty());
	    System.out.println(S);
	    
	    Set S1 = new HashSet();
	    int array[] = {29,5,18,1};
	    for(int i=0;i<4;i++)
	    	S1.add(array[i]);
	    System.out.println(S1);
	    S1.remove(3);
	    System.out.println(S1);
	    System.out.println(S1.size());
	    S1.add(1);
	   
	   
	    
	    
	}
	

}
