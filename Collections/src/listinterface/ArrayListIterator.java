package listinterface;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(); // linked list can be implement in the same way as arraylist
		
		fruits.add("Mango");
		fruits.add("Papaya");
		fruits.add("Kiwi");
		fruits.add("Apple");
		System.out.println(fruits);
		
		for(int i = 0; i<fruits.size(); i++) {
			System.out.println("Fruit is " + fruits.get(i));
		}
		
		for(String fruit: fruits) {
			System.out.println("For each fruit " + fruit);
		}
		
		
		//Iterator
		//Iterator has list Iterator in it
		//It is a method comming from Collection
		Iterator<String>  fe = fruits.iterator();
		
		while(fe.hasNext()) {
			System.out.println("Iterator " + fe.next());
		}
		
		List<String> smalllist = fruits.subList(1, 3);
		System.out.println(smalllist);

	}

}
