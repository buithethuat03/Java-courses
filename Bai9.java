import java.util.ArrayList;
public class Bai9 {
   
    


    public static void main(String[]args)
    {
        ArrayList<String>food=new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("hotdog");


        food.set(1,"rice");
        food.remove(1);
        food.clear();
        for(int i=0;i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
    }
}
