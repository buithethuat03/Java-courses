import java.io.*;
public class Bai19 {
    public static void main(String[] args)
    {

        File file = new File("data.txt");
        if(file.delete())
        {
            System.out.println("Successful delete a file named " + file.getName());
        }
        else
        {
            System.out.println("Cannot delete!");
        }
    }
}
