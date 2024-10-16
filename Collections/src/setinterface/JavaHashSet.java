package setinterface;

import java.util.Set;
import java.util.HashSet;
public class JavaHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(50);
		set.add(90);
		set.add(30);
		set.add(20);
		System.out.println(set);
		set.remove(10);
		System.out.println(set);

	}

}
