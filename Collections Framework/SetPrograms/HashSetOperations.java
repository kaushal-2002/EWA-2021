package SetPrograms;

import java.util.HashSet;

public class HashSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> vehicle = new HashSet<>();
		
		vehicle.add("Tata");
		vehicle.add("Bajaj");
		vehicle.add("Land Rover");
		vehicle.add("Hero");
		vehicle.add("Maruti");
		vehicle.add("Mahindra");
		vehicle.add("Hyundai");
		
//		String str = "Tata";
//		System.out.println("Hashcode of Tata is: "+str.hashCode());
		
		System.out.println("List of Automobile companies in India: "+vehicle);
		
		System.out.println("Name exists? "+vehicle.contains("Hero"));
		
//		System.out.println("Set hashcode is: "+vehicle.hashCode());
		
		// Union, Difference, Intersection
		
		HashSet<String> auto = new HashSet<>();
		
		auto.add("Tesla");
		auto.add("Ford");
		auto.add("Ferrari");
		auto.add("Toyota");
		auto.add("Honda");
		auto.add("MG");
		auto.add("Kia");
		auto.add("Hyundai");
		
		// Union of two sets
		
//		auto.addAll(vehicle);
//		
//		System.out.println("Union of two vehicle lists: "+auto);
//		
//		Intersection of two sets
		
//		auto.retainAll(vehicle);
//		
//		System.out.println("Intersection of two lists: "+auto);
		
//		 Difference of two sets
		
		vehicle.removeAll(auto);
		
		System.out.println("Difference between two sets: "+vehicle);
		
		
	}

}
