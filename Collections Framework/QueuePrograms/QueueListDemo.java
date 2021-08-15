package QueuePrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a linkedlist object and assign that object to Queue reference
		
		Queue<String> queueL = new LinkedList<>();
		
		// insert elements
		queueL.add("Apple");
		queueL.add("Samsung");
		queueL.add("Nokia");
		queueL.add("OnePlus");
		queueL.add("Asus");
		
		System.out.println("List of smartphone makers: "+queueL);
		
		System.out.println("Element removed from the front: "+queueL.remove());
		
		System.out.println("Element at the front: "+queueL.peek());
		
		System.out.println("List of updated smartphone makers: "+queueL);
		
		System.out.println("Another element removed from front: "+queueL.poll());
		
		queueL.add("Xiomi");
		queueL.add("Oppo");
		queueL.add("Vivo");
		
		
		queueL.offer("Micormax");
		
		System.out.println("List of elements [updated]: "+queueL);
		
		System.out.println("element at the front is: "+queueL.element()); 
		
		Iterator<String> itr = queueL.iterator();
		
		List<String> list = new LinkedList<>();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
