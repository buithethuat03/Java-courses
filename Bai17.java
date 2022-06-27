import java.io.*;

//Write to a file
public class Bai17 {
    public static void main(String[] args)
    {
        try
        {
            //If file already exists, write to it, otherwise create it and write to it.
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write("\tHello world!");
            myWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
