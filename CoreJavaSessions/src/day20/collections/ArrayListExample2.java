package day20.collections;
import java.util.ArrayList;
public class ArrayListExample2 {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		System.out.println("Initial list of elements: " + al);
		System.out.println("list of elements status: " + al.isEmpty());
		// Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " + al);
		// Adding an element at the specific position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);
		ArrayList al2 = new ArrayList();
		al2.add("Sonoo");
		al2.add("Hanumat");
		// Adding second list elements to the first list
		System.out.println("List al2 element: " + al2);
		System.out.println("al element before adding al2: " + al);
		al.addAll(al2);
		System.out.println("List al element after adding list al2: " + al);
		ArrayList al3 = new ArrayList();
		al3.add("John");
		al3.add("Rahul");
		System.out.println("Elements of al2: " + al2);
		System.out.println("Elements of al3: " + al3);
		// Adding second list elements to the first list at specific position
		al2.addAll(1, al3);
		System.out.println("After adding al3 into al2: " + al2);
	}
}
