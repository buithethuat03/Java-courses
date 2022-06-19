import java.util.Random;
public class Bai6 {
    public static void main(String[] args)
    {
        int x=5;
        if(x>0)
        {
            System.out.println("x higher than 0");
        }
        else if(x<-5)
        {
            System.out.println("x lower than -5");
        }
        else
        {
            System.out.println("x between -5 and 0");
        }

        int y=5;
        switch(y)
        {
            case 1:
            {
                System.out.println("the value of y is 1");
                break;
            }

            case 2:
            {
                System.out.println("the value of y is 2");
                break;	
            }

            case 3:
            {
                System.out.println("the value of y is 3");
                break;
            }

            default:
            {
                System.out.println("the value of y is unknown");
                break;
            }
        }
        Random random = new Random();
        boolean bool;
        for(int i=0;i<3;i++)
        {
            bool=random.nextBoolean();
            if(bool)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

        int lap=0;
        while(lap<3)
        {
            lap++;
            System.out.println("for loop: "+lap);
        }

        do
        {
            lap--;
            System.out.println("for loop -:"+lap);
        }while(lap>0);
    }
}
