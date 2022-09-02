package assignment;

public class CountDigit {

	public static void main(String[] args) {
		
		int num=12345,counter=0;
		for(;num>0;num=num/10) {
			counter++;
		}
		System.out.println("Count of digit in given number: "+counter);

	}

}
