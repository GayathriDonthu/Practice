import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		m.put(1,"Gayathri");
		m.put(2, "Mamatha");
		m.put("k","lilla");
		m.put(0.454,0.85);
		System.out.println(m.get("k"));
		System.out.println(m.containsKey(1));
		
	}

}
