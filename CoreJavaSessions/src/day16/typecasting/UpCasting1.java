package day16.typecasting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpCasting1 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		UpCasting1 u1=new UpCasting1();
		
		Mumbai m1=new UpCasting1();//
		Mumbai m2=u1;//
		Pune p1=new UpCasting1();//
		Pune p2=u1;//
		
		Mumbai m3=(Mumbai)new UpCasting1();//
		Mumbai m4=(Mumbai)u1;//
		Pune p3=(Pune) new UpCasting1();//
		Pune p4=(Pune)u1;//
		
		Pune p5=new Mumbai();//
		Pune p6=(Pune)new Mumbai();//
	}

}
