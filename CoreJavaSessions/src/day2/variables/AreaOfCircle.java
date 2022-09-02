package day2.variables;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		System.out.println("Programs Starts");
		//are = pi * r * r
		double r=5, area;
		area= (22/7)*r*r;
		System.out.println("Redious of circle is : "+r);//5.0
		System.out.println("Area of circle is: "+area);//75
		System.out.println("********************************");
		area= (22.0/7)*r*r;
		System.out.println("Redious of circle is : "+r);//5.0
		System.out.println("Area of circle is: "+area);//78.571
		System.out.println("********************************");
		area= 3.14*r*r;
		System.out.println("Redious of circle is : "+r);//5.0
		System.out.println("Area of circle is: "+area);//78.5
		System.out.println("********************************");
		double pi=3.14;
		area= pi*r*r;
		System.out.println("Redious of circle is : "+r);//5.0
		System.out.println("Area of circle is: "+area);//78.5
		System.out.println("Programs Ends");
	}
}
