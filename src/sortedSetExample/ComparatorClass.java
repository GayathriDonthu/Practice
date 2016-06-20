package sortedSetExample;

import java.util.Comparator;

public class ComparatorClass implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1 = new Company("Accy",2067);
		Company c2 = new Company("Google", 55678);
		ComparatorClass cc = new ComparatorClass();
		int val = cc.compare(c1, c2);
		if(val > 0 )
			System.out.println("Accy is bigger");
		else
			System.out.println("Google is bigger");

	}
	@Override
	public int compare(Object o1, Object o2) {
		Company c1 = (Company) o1;
		Company c2 = (Company) o2;
		if(c1.getCountOfemp() == c2.getCountOfemp())
			return 0;
		else 
			return c1.getCountOfemp() > c2.getCountOfemp() ? 1 : -1;
		
	}
	
}

class Company {
	String cname;
	int countOfemp;
	
	public Company(String cname, int count)
	{
		this.cname = cname;
		this.countOfemp = count;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCountOfemp() {
		return countOfemp;
	}
	public void setCountOfemp(int countOfemp) {
		this.countOfemp = countOfemp;
	}
	
	
	
	
}
