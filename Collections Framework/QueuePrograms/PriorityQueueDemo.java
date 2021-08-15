package QueuePrograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		
		// insert elements into priority queue
		
		pqueue.add(100);
		pqueue.add(50);
		pqueue.add(70);
		pqueue.add(40);
		pqueue.add(200);
		pqueue.add(180);
		
//		System.out.println("Element with the highest priority is: "+pqueue.remove());
		
		System.out.println("elements inside priority queue: "+pqueue);
		
		System.out.println("Element at the top is: "+pqueue.peek());
		
		pqueue.add(10);
		
		
		System.out.println("elements inside updated priority queue: "+pqueue);
		
		System.out.println("element at the top is: "+pqueue.poll());
		
		// Iterator over a priority queue
		
		 Iterator<Integer> itr = pqueue.iterator();
		 
		 while(itr.hasNext())
			 	System.out.print(itr.next()+" ");
		 
		 PriorityQueue<String> pqueue2 = new PriorityQueue<>();
		 
		 pqueue2.add("John");
		 pqueue2.add("Sam");
		 pqueue2.add("Kate");
		 pqueue2.add("Harry");
		 pqueue2.add("Harold");
		 pqueue2.add("Betty");
		 pqueue2.add("Sunny");
		 
		 System.out.println("Names inside Priority Queue: "+pqueue2);
		 
	}

}
