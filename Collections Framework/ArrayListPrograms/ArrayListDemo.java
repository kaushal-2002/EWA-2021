package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		
		// add elements into arraylist
		
		list1.add("Amazon");
		list1.add("Apple");
		list1.add("Microsoft");
		list1.add("Flipkart");
		list1.add("Zomato");
		list1.add("TCS");
		list1.add("Amazon");
		list1.add("Flipkart");
		list1.add(2, "Tesla");
		
		System.out.println("List of companies: "+list1);
		
		/*
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		*/
//		
//		for(String data : list1)
//			System.out.println(data);
		
		list1.remove("Ebay");
		
		System.out.println("Is this company listed: "+list1.contains("Ebay"));
		
		list1.set(1, "Samsung");
		
		System.out.println("Last index of duplicate value: "+list1.lastIndexOf("Flipkart"));
		
		System.out.println("List of updated companies: "+list1);
		
		
		Iterator itr = list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		// this is arraylist demo
	}

}
