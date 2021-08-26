package MapPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> link = new LinkedHashMap<>();
		link.put(101, "India");
		link.put(106, "USA");
		link.put(112, "Canada");
		link.put(187, "Nepal");
		link.put(178, "South Korea");
		link.put(125, "China");
		
		System.out.println("List of country records: "+link);
		
		System.out.println("Set view of country records: "+link.entrySet());
		
		Iterator<Entry<Integer, String>> itr = link.entrySet().iterator();
		
		while(itr.hasNext())
				System.out.print(itr.next()+" ");
	}

}
