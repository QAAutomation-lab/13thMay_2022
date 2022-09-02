package day20.collections;
import java.util.ArrayList;
public class ArrayListExample3 {
	public static void main(String[] args) {
//		ArrayList<Integer> l1 = new ArrayList<Integer>();//Generic
//		l1.add(12);
//		ArrayList<Boolean> l2 = new ArrayList<Boolean>();//Generic
//		l2.add(true);
//		ArrayList<Character> l3 = new ArrayList<Character>();//Generic
//		l3.add('a');

		//Using Generic way
		ArrayList<String> al = new ArrayList<String>();//Generic
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements: " + al);
		// Removing specific element from arraylist
		System.out.println("remove Vijay from collection: "+al.remove("Vijay"));
		System.out.println("After invoking remove(object) method: " + al);
		// Removing element on the basis of specific position
		System.out.println("remove index 0 from collection: "+al.remove(0));
		System.out.println("After invoking remove(index) method: " + al);
		System.out.println("***********************************************");
		// Creating another arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		// Adding new elements to arraylist
		al.addAll(al2);
		System.out.println("Updated list : " + al);
		// Removing all the new elements from arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: " + al);
		// Removing elements on the basis of specified condition
//		if(al.contains("Ajay")) {
//			al.remove("Ajay");
//		}
				//or
		al.removeIf(str -> str.contains("Ajay")); // Here, we are using Lambda expression
		System.out.println("After invoking removeIf() method: " + al);
		// Removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear() method: " + al);
	}
}
