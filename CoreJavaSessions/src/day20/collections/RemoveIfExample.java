package day20.collections;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<Integer>();
		number.add(25);
		number.add(10);
		number.add(5);
		number.add(25);
		System.out.println("Size "+number.size());
		System.out.println(number);
		number.removeIf(n->(n%2==0));
		System.out.println(number);
	}

}
