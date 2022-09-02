package day6.statements;

public class SwitchCase2 {

	public static void main(String args[]) {
		int month = 1;
		switch (month) {
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		default:
			System.out.println("Sorry either the value you have given is invalid or not matched with any of the case.");
			break;
		}
	}
}
