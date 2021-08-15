package LinkedListPrograms;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a linked list object
		LinkedList<String> list = new LinkedList<>();
		
		// insertion
		list.add("India");
		list.add("USA");
		list.add("Russia");
		list.add("Japan");
		list.add("Canada");
		
		System.out.println("List of countries: "+list);
		
		list.addFirst("Nepal");
		
		System.out.println("Update list: "+list);
		
		// fetch the name of 3rd country in the list
		System.out.println("name of the 3rd country is: "+list.get(3));
		
		list.removeLast();
		
		System.out.println("Changes after removing the last element: "+list);
		
		Iterator itr = list.iterator();
		list.set(2, "China");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using a List Iterator....");
		
		ListIterator listItr = list.listIterator();
		
		while(listItr.hasNext()) {
			listItr.next();
		}
		
		listItr.set("Britain");
		
		System.out.println(list);
		
		
		System.out.println("Traversing the list backwards...");
		
		while(listItr.hasPrevious()) {
			System.out.print("["+listItr.previous()+"]");
		}
		
	}

}
