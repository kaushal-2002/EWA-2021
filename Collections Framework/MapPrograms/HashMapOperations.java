package MapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(101, "India");
		map.put(102, "USA");
		map.put(103, "Canada");
		map.put(105, "New Zealand");
		map.put(108, "UK");
		map.put(205, "Italy");
		map.put(709, "Germany");
		
		System.out.println("Map of Countries: "+map);
		
		System.out.println("Country name with country code 105 = "+map.get(105));
		
		map.put(205, "France");
		
		map.putIfAbsent(709, "Russia");
		
		map.remove(103);
		
		System.out.println("Entry set view: "+map.entrySet());
		
		// Traversing through map using entrySet()
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry+" ");
		}
		
		System.out.println();
		
		// Traversing through map using keySet() 
		for(Integer key: map.keySet()) {
			System.out.println(key);
		}
		
		// Traverse through the values using values()
		for(String value: map.values()) {
			System.out.println(value+" ");
		}
		
		System.out.println();
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
	}

}
