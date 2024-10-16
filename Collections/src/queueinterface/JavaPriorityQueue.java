package queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();

		pq.add(30);
		pq.add(40);
		pq.add(10);
		pq.add(20);
		System.out.println(pq);
		System.out.println(pq.poll()); // popping by priority		
		System.out.println(pq);
		System.out.println(pq.poll());
		
		System.out.println("--------------------------");
		//working by  priority comparator
		Queue<Integer> pcq = new PriorityQueue<>((a,b) -> b-a);

		pcq.add(30);
		pcq.add(40);
		pcq.add(10);
		pcq.add(20);
		
		System.out.println(pcq);
		System.out.println(pcq.poll()); // popping by priority		
		System.out.println(pcq);
		System.out.println(pcq.poll());
		
	}

}
