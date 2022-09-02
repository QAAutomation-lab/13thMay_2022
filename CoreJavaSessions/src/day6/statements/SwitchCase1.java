package day6.statements;

public class SwitchCase1 {
	public static void main(String args[]) {
		int value = 3;
		switch (value) {
		case 3:
			System.out.println("Congratulations here is the case 3 executed");
			break;
		case 4:
			System.out.println("Congratulations here is the case 4 executed");
			break;
		case 8:
			System.out.println("Congratulations here is the case 8 executed");
			break;
		default:
			System.out.println("Sorry none of your cases matched");
			break;
		}
	}
}
/**
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 
