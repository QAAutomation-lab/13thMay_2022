package day2.variables;
class Temp 
{
	public static void main(String[] args) 
	{
		/*System.out.println("Program Starts");
		float f,x,y,result;
		 f= 98.6;
		 x= f-32;
		 y= x*5;
		 result= y/9;
        System.out.println("Fahrenheit Temperature is : "+F);
		System.out.println("Celcius Temperature is : "+result);
		System.out.println("Program Ends");
		*/
		float F = 75.20f;
		float C=((F-32)*(5.0f/9));
		System.out.println("The temperature is in celsius: " + C +"°C");
	}
}
