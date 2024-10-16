package setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {

	public static void main(String[] args) {
		
		Set<Integer> lset = new LinkedHashSet<>();
		
		lset.add(10);
		lset.add(50);
		lset.add(90);
		lset.add(30);
		lset.add(20);
		lset.add(20);
		lset.add(20);
		System.out.println(lset); 
	}

}
