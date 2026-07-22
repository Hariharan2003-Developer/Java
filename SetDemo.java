package JavaLearnings;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add("Hello");
		hs.add(18);
		hs.add(false);
		hs.add(10);
		
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(10);
		lhs.add("Hii");
		lhs.add(true);
		lhs.add(45);
		
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		
		ts.add("Dhanraj");
		ts.add("Hari");
		ts.add("Arun");
		ts.add("Mohan");
		
		System.out.println(ts);
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(7);
		ll.add(18);
		ll.add(45);
		ll.add(33);
		ll.add(7);
		ll.add(10);
		
		System.out.println(ll);
		
		TreeSet tsh = new TreeSet(ll);
		System.out.println(tsh);

	}

}
