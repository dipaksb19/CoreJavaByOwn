package listinterface;

import java.util.ArrayList;
import java.util.List;
public class ArrayListLearn {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //we created list object of type ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(202));
		
		//if pass object it removes by value
		list.remove(Integer.valueOf(10)); // removed by value
		list.remove(1); // removed by index
		System.out.println(list);
		
		System.out.println("_________________________________");
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(20);
		System.out.println(list2);
		
	//	list.addAll(list2);
	//	System.out.println(list);
		
	//	list.removeAll(list2);
	//	System.out.println(list);
		
		
		list.retainAll(list2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		
		//to convert list to object array
		Object arr[] = list.toArray();
		System.out.println("************************************");
		
		//*******************************************************
		//Methods  of List Interface
		
		
		List<Integer> list3 = new ArrayList();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		list3.add(400);
		System.out.println(list3);
		System.out.println(list3.get(1));
		
		
		list3.set(0, 1000);
		System.out.println(list3);
		
		
		list3.add(2, 2000);
		System.out.println(list3);
		
		
		list3.remove(2);
		System.out.println(list3);
		
		System.out.println(list3.indexOf(1000));
		
		System.out.println(list3.lastIndexOf(200));
		
		

	}

}
