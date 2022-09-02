package assignment;

public class PyramidPrograms2 {

	public static void main(String[] args) {
		
		for(int i=5;i>0;i--) {//number of lines
			for(int j=0;j<i;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}
		
		drawPyramid(5, '*');
		System.out.println("++++++++++++++++Even+++++++++++++++++++++++");
		
		System.out.println("+++++++++++++++++Odd++++++++++++++++++++++");
		
		System.out.println("+++++++++++++++++Prime++++++++++++++++++");
		
	}
	public static void drawPyramid(int numberOfLine,char c1) {
		for(int i=numberOfLine;i>0;i--) {//number of lines
			for(int j=0;j<i;j++) {//define patterns
				System.out.print(c1+" ");
			}
			System.out.println();
		}
	}

}
