package day_two3007;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String []srgs) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		
		System.out.println("By using for loop");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------");
		
		System.out.println("By using for each loop");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		
		System.out.println("The index no of element : " + list.indexOf("Mango"));
		list.set(1, "Apple");
		System.out.println("-------------------------");
		
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		
		System.out.println(list.contains("Grapes"));
		System.out.println("-------------------------");
		list.remove(3);
		for(String str:list) {
			System.out.println(str);
		}
		
	}
}
