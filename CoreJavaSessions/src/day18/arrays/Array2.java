package day18.arrays;

public class Array2 {

	public static void main(String[] args) {
		// create an array
		int[] age = { 12, 4, 25, 2, 5 };
		// access each array elements
		System.out.println("Accessing Elements of Array:");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);
		System.out.println("array size: " + age.length);
		System.out.println("***************Using for Loop:");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
//			if (age[i] == 25) {
//				System.out.println(age[i]);
//				break;
//			} else {
//				System.out.println("age is not 25");
//			}
		}
		System.out.println("************Using for-each Loop:");
		for (int a : age) {
			System.out.println(a);
//			if(a==25){
//			System.out.println(a);
//			break;
//			}else {
//				System.out.println("age is not 25");
//			}
		}
	}
}
