import java.util.Scanner;
public class Bai3 {
    static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[]args)
    {
        int a=23;
        int b=25;
        int c=sum(a,b);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sum: "+c);
        System.out.println("What is your name?");
        String name=scanner.nextLine();
        System.out.println("Your name is: "+name);
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        System.out.println("Your age is: "+age);
    }
}
