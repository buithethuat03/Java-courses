import java.util.*;

public class Bai12 {
    
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return add(add(a,b),c);
    }
    public static void main(String[]args)
    {
        int a=2;
        int b=2;
        int f=12;
        double c=12.4;
        double d=3.14;
        System.out.println(add(a,b));
        System.out.println(add(c,d));
        System.out.println(add(a,b,f));
    }
}
