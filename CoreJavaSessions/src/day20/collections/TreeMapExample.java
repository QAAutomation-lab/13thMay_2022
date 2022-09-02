package day20.collections;

import java.util.SortedMap;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap m1=new TreeMap();	
		m1.put("key1", "admin");//upcasting
		m1.put("key5", "admin");//upcasting
		m1.put("key3", "admin123");//upcasting
		m1.put("key0", "admin");//upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		SortedMap m2=m1.subMap("key1", "key5");
		System.out.println(m2);
	}
}

