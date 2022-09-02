package day7.thiskeywords;

class FinalKeyword2 {

	final int speedlimit;// blank final variable
	FinalKeyword2() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println(f1.speedlimit); 
	}
}

/**
Any variable which is declared as final should be initialize at the same time.
but for Non static global final variable can declared and initialize inside the constructor body
*/