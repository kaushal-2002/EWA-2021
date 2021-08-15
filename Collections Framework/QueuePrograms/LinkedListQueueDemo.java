package QueuePrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> lqueue = new LinkedList<>();
		
		// insertion and deletion in queue
		
		lqueue.add("Avengers");
		lqueue.add("Batman");
		lqueue.add("Superman");
		lqueue.add("Spiderman");
		lqueue.add("Thor");
		lqueue.add("Dr. Strange");
		
		System.out.println("Movies added in queue: "+lqueue);
		
		System.out.println("Front element in queue is: "+lqueue.peek());
		
		lqueue.offer("Jungle Cruise");
		
		System.out.println("Size of this queue is: "+lqueue.size());
		
		System.out.println("Element removed from the front: "+lqueue.remove());
		
		lqueue.poll();
		
		lqueue.clear();
		
		lqueue.peek();
		
		Iterator<String> itr = lqueue.iterator();
		
		
	}

}
