package day17.poly;
class Car {
	int price=25000;
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	int price =50000;
	void run123()
	{
		System.out.println("running fast at 120km");
	}
}
public class Runtime3 {
	public static void main(String args[]) {
		Car c = new innova();
		c.run();
		System.out.println(c.price);//
	}
}