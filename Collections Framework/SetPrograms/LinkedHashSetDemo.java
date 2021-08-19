package SetPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialization
		LinkedHashSet<Integer> linkHash = new LinkedHashSet<>();
		
		linkHash.add(21);
		linkHash.add(32);
		linkHash.add(14);
		linkHash.add(56);
		linkHash.add(124);
		linkHash.add(105);
		linkHash.add(95);
		
		System.out.println("Elements inside LinkedHashSet are: "+linkHash);
	
		Iterator<Integer> itr = linkHash.iterator();
		
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}

}
