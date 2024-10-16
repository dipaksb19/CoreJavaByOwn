package listinterface;

import java.util.List;
import java.util.Stack;

public class JavaStsck {

	public static void main(String[] args) {

		//List<String> Fruits = new Stack<>();
		Stack<String> Fruits = new Stack<>();
		
		Fruits.push("A");
		Fruits.push("B");
		Fruits.push("C");
		Fruits.push("D");
		Fruits.push("E");
		System.out.println(Fruits);
		
		System.out.println(Fruits.pop());
		System.out.println(Fruits);
		
		System.out.println(Fruits.peek());
		System.out.println(Fruits);
		
		System.out.println(Fruits.isEmpty());
		
		
//		Fruits.add("A");
//		Fruits.add("B");
//		Fruits.add("C");
//		Fruits.add("D");
//		Fruits.add("E");
//		System.out.println(Fruits);

	}

}
