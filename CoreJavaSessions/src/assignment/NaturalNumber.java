package assignment;

public class NaturalNumber {

	public static void main(String[] args) {
		
		System.out.println("Sum of natural number: "+getSumOfNaturalNumbers(15));
		getSumOfNaturalNumbers2(5);
	}
	static int getSumOfNaturalNumbers(int num) {
		int sum=0;
		for(int i =1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	static void getSumOfNaturalNumbers2(int num) {
		int sum=0;
		for(int i =1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of natural number: "+sum);
	}
}
/**
num=5
1+2+3+4+5
sum=0+1=1
sum=1+2=3
sum=3+3=6
sum=6+4=10
sum=10+5=15
*/