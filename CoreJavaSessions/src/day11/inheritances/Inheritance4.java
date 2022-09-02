package day11.inheritances;
//parent class
class vehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
}
// first child class of vehicle class
class bike extends vehicle {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}
// second child class of vehicle class
class Car1 extends vehicle {
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}
// third child class of vehicle class
class scooter extends vehicle {
	
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class Inheritance4 {
	public static void main(String[] args) {
		
		Car1 c = new Car1(); // object of car class
		c.wheels();
		c.countwlc();
		bike b = new bike();// object of bike class
		b.wheels();
		b.countwl();
		scooter sc = new scooter(); // object of scooter class
		sc.countwls();
		sc.wheels();
	}
}