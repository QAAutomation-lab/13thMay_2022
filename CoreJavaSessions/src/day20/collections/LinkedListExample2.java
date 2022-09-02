package day20.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Initial list of elements: " + ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking add(E e) method: " + ll);
		
		ListIterator itr1=ll.listIterator();
		System.out.println(itr1.hasPrevious());
		System.out.println(itr1.hasNext());
		
		System.out.println(itr1.next());
		System.out.println(itr1.hasPrevious());
		System.out.println(itr1.hasNext());
		
		ListIterator itr=ll.listIterator();
		/*
		 * hasNext(),next(),remove()
		 * hasPrevious(), previous();
		 */
		System.out.println(itr.hasPrevious());
		System.out.println(itr.next());
		System.out.println(itr.previous());
		System.out.println(itr.hasPrevious());

	}
}
