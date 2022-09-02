package day7.overloading;
/**
 * Question 2 – return type is different. Method name & argument list same.
 */
public class MethodOverloading7
{
   public double myMethod(int num1, int num2)
   {
      System.out.println("First myMethod of class Demo");
      return num1+num2;
   }
   public int myMethod(int var1, int var2)
   {
      System.out.println("Second myMethod of class Demo");
      return var1-var2;
   }
   public static void main(String args[])
   {
      MethodOverloading7 obj2= new MethodOverloading7();
      obj2.myMethod(10,10);
      obj2.myMethod(20,12);
   }
}