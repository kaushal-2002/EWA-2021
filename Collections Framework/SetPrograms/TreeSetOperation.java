package SetPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(12);
		tree.add(18);
		tree.add(6);
		tree.add(32);
		tree.add(87);
		tree.add(2);
		tree.add(8);
		tree.add(10);
		tree.add(85);
		tree.add(78);
		tree.add(21);
		
		System.out.println("Elements inside Treeset are: "+tree);
		
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext())
				System.out.print(itr.next()+" ");
		
	}

}
