package day20.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map m1=new HashMap();	
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");//upcasting
		m1.put(null, "admin123");//upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		
		Map m2=new HashMap();
		m2.put("A1", 123);
		m2.put("A2", 456);
		m2.put("A3", 789);
		m2.put("Key2", "admin");
		System.out.println("Map elements are: "+m2);
		System.out.println("Map element count: "+m2.size());
		
		m1.putAll(m2);
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
	}
}
/**
 * to add any element in Map we need use put(key,value) 
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 
