package day18.arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int age[]={10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		//number of rotation for array element
		int n=1;
		//logic to rotate array elements
		for(int i=0;i<n;i++) {
			
			int first=age[0],j;
			for(j=0;j<age.length-1;j++) {
				age[j]=age[j+1];
			}
			age[j]=first;
			
		}
		System.out.println();
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
	}

}
/*
int age[]={10,25,10,30,10,25,10,20,10,30,45};

*/