package LinkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize the linked list object
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Gotham");	// 0
		list.add("GOT");	// 1
		list.add("Batman");
		list.add("TVD");
		list.add("Avengers");
		
		System.out.println("List of TV Series: "+list);
		
		list.add(2, "Superman");
		System.out.println("List of updated TV Series: "+list);
		
		list.addLast("Aquaman");
		
		System.out.println("List of updated Series 2: "+list);
		
		System.out.println("Does the series exist? "+list.contains("TVD"));

		list.set(1, "Prison Break");
		
		System.out.println("Updated list: "+list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// ListIterator - forward as well as backward | CRUD operation
		
		ListIterator<String> advancedItr = list.listIterator();
		
//		ListIterator<String> litsItr = new ListIterator<>();
		
		
//		 Moving the iterator in forward direction
		while(advancedItr.hasNext()) {
			System.out.print(advancedItr.next()+" ");
		}
		
		System.out.println();
//		Moving this iterator in reverse direction
		while(advancedItr.hasPrevious()) {
			System.out.print(advancedItr.previous()+" ");
		}
		
//		CRUD --> Create , Read, Update & Delete 
		
		advancedItr.next();	// move the cursor from its initial/current position in forward direction
//		advancedItr.remove();
//		advancedItr.add("POI");		
		System.out.println();
//		System.out.println(list);
		
//		while(advancedItr.hasPrevious()) {
//			System.out.print(advancedItr.previous()+" ");
//		}
//		
//		do not write add()/remove() after making a call to next() 
		advancedItr.set("Flash");
		
		System.out.println(list);
		
		
	}

}
