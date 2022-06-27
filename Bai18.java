import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bai18
{
  public static void main(String[]args)
  {
    try
    {
        File myFile=new File("data.txt");
        Scanner reader=new Scanner(myFile);
        while(reader.hasNextLine())
        {
          String data=reader.nextLine();
          System.out.println(data);
        }
        reader.close();
    }
    catch (IOException e)
    {
      System.out.println("Something went wrong!");
      e.printStackTrace();
    }
  }
}
