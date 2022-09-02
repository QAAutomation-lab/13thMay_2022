package day20.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();// Creating HashMap

		map1.put(1, "Mango"); // Put elements in Map
		map1.put(2, "Apple");
		map1.put(3, "Banana");
		map1.put(1, "Grapes"); // trying duplicate key
		System.out.println("Map elements: "+map1);
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("Initial list of elements: " + hm);
		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method list of elements: " + hm);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(102, "Ravi");
		map.putAll(hm);
		System.out.println("After invoking putAll() method "+map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Initial list of elements: " + map);
		// key-based removal
		map.remove(100);
		System.out.println("Updated list of elements: " + map);
		// key-value pair based removal
		map.remove(102, "Rahul");
		System.out.println("Updated list of elements: " + map);
		// key-based value replace
		map.replace(103, "Amar");
		System.out.println("Updated list of elements:"+map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// key-value based value replace
		map.replace(101, "Vijay", "Ravi");
		System.out.println("Updated list of elements:"+map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

