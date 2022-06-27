import java.io.*;
public class Bai20 {
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("data.txt");
            int data=reader.read();
            while(data!=-1)
            {
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
