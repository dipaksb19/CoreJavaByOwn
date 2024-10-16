package queueinterface;

import java.util.LinkedList;
import java.util.Queue;
public class JavaQueueInterface {

	public static void main(String[] args) {
		System.out.println("-----Queue Interface-----");
		
		Queue<Integer>  q = new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		System.out.println(q);
		
//		System.out.println(q.poll());
//		System.out.println(q);
//		
//		System.out.println(q.peek());
//		System.out.println(q);
//		
//		System.out.println(q.poll());
//		System.out.println(q);
		
		while(!q.isEmpty()) { // to make queue empty by loop
			System.out.println(q.poll());
		}
		System.out.println(q.poll());
		
	//	System.out.println(q.remove());  exception

		
	}

}
