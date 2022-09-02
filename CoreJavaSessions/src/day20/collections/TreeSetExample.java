package day20.collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("TreeSet elements are: "+al);
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through Iterator in descending order");

		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("TreeSet elements are: "+set);
		System.out.println("first element Value: " + set.pollFirst());
		System.out.println("After pollFirst(),TreeSet elements are: "+set);
		System.out.println("last element Value: " + set.pollLast());
		System.out.println("After pollLast(), TreeSet elements are: "+set);

		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial Set: " + set2);

		System.out.println("Reverse Set: " + set2.descendingSet());//high to low
		System.out.println("Head Set: " + set2.headSet("C"));//a,b 
		System.out.println("Head Set: " + set2.headSet("C", true));//abc
		
		System.out.println("SubSet: " + set2.subSet("A", "E"));//abcd 		
		System.out.println("SubSet: " + set2.subSet("A", false, "E", true));//bcde
		
		System.out.println("TailSet: " + set2.tailSet("C"));//cde		
		System.out.println("TailSet: " + set2.tailSet("C", false));//de
	}
}