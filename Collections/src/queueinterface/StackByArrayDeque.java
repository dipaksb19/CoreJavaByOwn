package queueinterface;

import java.util.Queue;
import java.util.ArrayDeque;


public class StackByArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		
		//Implementing queue by arraydeque
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		System.out.println(q);
		
		System.out.println(q.poll());
	}

}
