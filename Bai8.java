import java.util.Scanner;

public class Bai8 {

    static String name;

    public static void main (String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=scanner.nextLine();
        
        int result=name.length();
        System.out.println("The length of name is " + result);

        char CharResult=name.charAt(2);
        System.out.println("The index of 2 is: "+CharResult);

        boolean booResult=name.isEmpty();
        System.out.println(booResult? "The name is empty!":"The name isn't empty");

        String upperResult=name.toUpperCase();
        System.out.println("The upper name is: "+upperResult);

        String lowerResult=name.toLowerCase();
        System.out.println("The lower name is: "+lowerResult);

        String replace=name.replace("t", "?");
        System.out.println("After replace t to ?, the name is: "+replace);
    }
}
