package MapPrograms;

import java.util.TreeMap;

public class TreeMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(156, "Honda City");
		tree.put(568, "Tata Safari");
		tree.put(875, "Kia Seltos");
		tree.put(547, "Toyota Fortuner");
		tree.put(854, "Mahindra XUV700");
		tree.put(158, "Ford Endevour");
		tree.put(249, "Tesla s-series");
		
		
		System.out.println("Record of Car Models: "+tree);
		
		System.out.println("Set view of TreeMap: "+tree.entrySet());
		
		System.out.println("Frist entry inside treemap: "+tree.firstEntry());
		
		System.out.println("Least key inside treemap: "+tree.firstKey());
		
		System.out.println("Greatest entry inside treemap: "+tree.lastEntry());
	
		System.out.println("Ceiling entry of 160 is: "+tree.ceilingEntry(160));
		
		System.out.println("Floor entry of 160 is: "+tree.floorEntry(160));
	}

}
