import java.util.Scanner;
public class Bai3
{
    int a,b;
    void swapNumbers(Bai3 number)
    {
        int temp=number.a;
        number.a=number.b;
        number.b=temp;
    }
    public static void main(String[] args)
    {
        Bai3 number =new Bai3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number.a=scanner.nextInt();
        System.out.println("Enter the second number: ");
        number.b=scanner.nextInt();

        number.swapNumbers(number);
        System.out.println("After swap, the first number is: "+number.a+", and the second number is: "+number.b);
    }

};
