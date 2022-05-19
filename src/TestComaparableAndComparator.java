import java.util.Comparator;
import java.util.TreeSet;

class Emp  implements Comparable<Emp>{
	int Id;
	String Name;
	public Emp(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public int compareTo(Emp o) {
		 int eid = this.Id;
		 int eid1 = o.Id;
		 
		 if(eid<eid1)
			 return 1;
		 else if(eid>eid1)
			 return -1;
		 else 
		 return 0;
	}
	 
	@Override
	public String toString() {
		 
		return "{"+"Id :-" +Id+ " "+"Name :-"+Name+"}" ;
	}
	
}

public class TestComaparableAndComparator {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(101, "Ravi");
		Emp e2 = new Emp(102, "Raju");
		Emp e3 = new Emp(103, "Deepak");
		Emp e4 = new Emp(104, "Pandit");
		
		TreeSet<Emp> ts = new TreeSet<Emp>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		
		
		
		
		TreeSet<Emp> ts1 = new TreeSet<Emp>(new MyComparator1());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		
		System.out.println(ts1);
		
		
	 
	}

}

class MyComparator1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 =(Emp)o1;
		Emp e2 =(Emp)o2;
		String  eid1Name= e1.getName();
		String  eid2Name= e2.getName();
		
		 
			return eid1Name.compareTo(eid2Name);
		 
		
		 
	}
	
	
} 
