package queueinterface;

import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
public class JavaArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offer(10);  //add
		dq.offerLast(20); // addLast
		dq.offerFirst(30);  // AddFirst
		System.out.println(dq);
		
		System.out.println(dq.poll());
		System.out.println(dq);
		
		System.out.println(dq.pollLast()); // removeLast
		System.out.println(dq);
		
		System.out.println(dq.peek());

	}

}
