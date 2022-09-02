package assignment;

public class PascalPyramid {

	public static void main(String[] args) {
		int row=6,num;
		for(int i=0;i<row;i++) { //number of line in pyramid
			for(int j=row;j>i;j--) {//format or spaces used to design the pyramid
				System.out.print(" ");
			}
			num=1;
			for(int j=0;j<=i;j++) {// print number in pyramid
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);//
			}
			System.out.println();
		}
	}
	
	static void pyramid2() {
		int row=5,ct=1;
		for(int i=row;i>0;i--) {
			
			for(int j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=ct;j++) {
				System.out.print(j+" ");
			}
			for(int j=ct-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			ct++;
		}
	}
}
/**
 *  F6: next line
 *  F5: go inside the function
 *  F8: continue
 *  Ctrl+shift+i : to check value of variable or method return value
 */
