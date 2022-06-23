import java.util.*;

public class Bai11 {
    static Scanner scanner =new Scanner(System.in);

    public static void main(String[]args)
    {
        int n;
        System.out.print("Enter the number of animals: ");
        n=scanner.nextInt();
        scanner.nextLine();
        String[]animals=new String[n];

        ArrayList<String>animal=new ArrayList<>();
        animal.add("lion");
        animal.add("cat");
        animal.add("horse");

        
        for(int i=0;i<n;i++)
        {
            animals[i]=scanner.nextLine();
        }
        for(String str:animals)
        {
            System.out.println(str);
        }
        System.out.println();

        for(String i:animal)
        {
            System.out.println(i);
        }
        
    }
}
