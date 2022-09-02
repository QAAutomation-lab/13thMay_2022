package assignment;

public class PyramidPrograms3 {

	public static void main(String[] args) {
		
		for(int i=7;i>0;i--) {//number of lines
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}		
		System.out.println("++++++++++++++++Even+++++++++++++++++++++++");
		int numForEven=15;
		int rowCt=(numForEven/2)+1;
		for(int i=rowCt;i>0;i--) {//number of lines
			numForEven=15;
			for(int j=1;j<=i;j++) {//define design
				System.out.print(" ");
			}
			for(int j=i;j<=rowCt;j++) {//define patterns
				if(numForEven%2==0) {
				System.out.print(numForEven+" ");
				numForEven--;
				}
				numForEven--;
			}
			System.out.println();
		}		
		System.out.println("+++++++++++++++++Odd++++++++++++++++++++++");
		
		System.out.println("+++++++++++++++++Prime++++++++++++++++++");
	}

}
