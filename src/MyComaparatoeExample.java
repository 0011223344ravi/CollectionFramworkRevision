import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class MyComaparatoeExample 
{
	public static void main(String[] args) {
	
		
		TreeSet<Integer> ts = new TreeSet<Integer>(  );
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(89);
		ts.add(0);
		
		System.out.println(ts);
		
		 
		
	
	
	}

}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		 
		if(o1>o2)
			return -1;
		else if(o1<o2)
		  return 1;
		else 
		return 0;
	}
	
	
} 


	

