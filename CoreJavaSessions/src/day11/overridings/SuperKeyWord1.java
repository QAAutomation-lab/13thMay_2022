package day11.overridings;

class Animal6 {
	String color = "white of red";
}
class Dog6 extends Animal6 {
	String color = "black";
	void printColor() {
		System.out.println("Dog color is : "+color);// prints color of Dog class
		System.out.println("Animal color is: "+super.color);// prints color of Animal class
	}
}
class SuperKeyWord1 {
	public static void main(String args[]) {
		Dog6 d = new Dog6();
		d.printColor();
		String s1="12 servers";
		System.out.println(s1.matches(".+[\\s]servers"));
		System.out.println(s1.indexOf("shailesh"));
		String[]  str=s1.split("shailesh");
		
	}
}
