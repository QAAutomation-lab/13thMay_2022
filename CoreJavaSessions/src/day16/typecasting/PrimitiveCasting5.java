package day16.typecasting;
class Sample
{
    void test1(double d)//
    {
        System.out.println("d value="+d);
    }
//    void test1(int k)
//    {
//        System.out.println("k value="+k);
//    }
}
public class PrimitiveCasting5 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample s=new Sample();
        s.test1(7);
        System.out.println("Program ends");         
    }
}