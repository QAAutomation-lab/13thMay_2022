package day6.statements;

public class SwitchCase3 {

	public static void main(String args[]) {
	
		System.out.println("is given char vowels: "+checkVowels('z'));
		System.out.println("Program ends here...");
	}
	
	static boolean checkVowels(char ch) {
		switch (ch) {
		case 'e':
			//System.out.println("Value matched - e, a vowel");
			return true;
		case 'a':
			//System.out.println("Value matched - a, a vowel");
			return true;
		case 'u':
			//System.out.println("Value matched - u, a vowel");
			return true;
		case 'o':
			//System.out.println("Value matched - o, a vowel");
			return true;
		case 'i':
			//System.out.println("Value matched - i, a vowel");
			return true;
		default:
			//System.out.println("Given char is not a vowel");
			return false;
		}
	}
}
