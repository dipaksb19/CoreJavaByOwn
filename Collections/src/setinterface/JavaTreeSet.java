package setinterface;

import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {

	public static void main(String[] args) {
		Set<Integer> tset = new TreeSet<>();
		
		tset.add(10);
		tset.add(50);
		tset.add(30);
		tset.add(90);
		tset.add(20);
		tset.add(20);
		tset.add(20);
		System.out.println(tset);
		
		tset.remove(20);
		System.out.println(tset);
		
		System.out.println(tset.contains(10));

		tset.contains(50);
		System.out.println(tset);


		

	}

}
