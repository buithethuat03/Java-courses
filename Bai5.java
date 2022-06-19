import  java.util.Scanner;
import java.util.Random;
public class Bai5 {
    public static void main(String[] args){
        double x=90;
        double radx=Math.toRadians(x);
        
        float y=2.818f;
        double sinx=Math.sin(radx);
        System.out.println(sinx);

        double min=Math.min(x,y);
        System.out.println(min);
    
        double a;
        double b;
        double c;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the first value: ");
        a=scanner.nextDouble();

        System.out.print("Enter the second value: ");
        b=scanner.nextDouble();

        c=Math.sqrt(a*a+b*b);
        System.out.println("The result is: "+c);

        Random random=new Random();

        int d=random.nextInt(100);
        System.out.println("The result random between 0 and 99 is: "+d);
    }
}
