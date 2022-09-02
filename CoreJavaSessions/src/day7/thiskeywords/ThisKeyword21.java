package day7.thiskeywords;
class ThisKeyword21
{
    int a;
    int b;     
    // Parameterized constructor
    ThisKeyword21(int a, int b)
    {
        this.a = a;
        this.b = b;
    } 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    } 
    public static void main(String[] args)
    {
    	ThisKeyword21 object = new ThisKeyword21(10, 20);
        object.display();
        System.out.println(object.a+" "+object.b);//
        ThisKeyword21 object2 = new ThisKeyword21(102, 201);
        object2.display();
        System.out.println(object2.a+" "+object2.b);//
    }
}