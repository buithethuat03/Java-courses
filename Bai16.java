import java.io.File;//File handling
import java.io.IOException;//File exception error

//Create a file

public class Bai16 {
    public static void main(String[] args)
    {
        try
        {
            File file = new File("data.txt");
            if(file.createNewFile())
            {
                System.out.println("File is created: "+file.getName());
            }
            else
            {
                System.out.println("File already exists!");
            }
        }
        catch(IOException e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}