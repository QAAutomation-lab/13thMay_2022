package day20.collections;

import java.util.Vector;
public class VectorExample2 {
	public static void main(String args[]) {
		// Create a vector
		Vector<String> vec = new Vector<String>();
		System.out.println("Elements are: " + vec.capacity());
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		System.out.println("Elements are: " + vec);		
		vec.addElement("mat");
		System.out.println("Elements are: " + vec.capacity());
		System.out.println("Elements are: " + vec);
		for(String str: vec) {
			System.out.println(str);
		}
	}
}

