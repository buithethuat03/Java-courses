import java.util.*;

public class Bai10 {

    
    public static void main(String[]args)
    {
        ArrayList<ArrayList<String>>all=new ArrayList<>();

        ArrayList<String>bakeryList=new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("donuts");
        bakeryList.add("garlic bread");

        ArrayList<String>produceList=new ArrayList<>();
        produceList.add("pomatoes");
        produceList.add("egg");
        produceList.add("peppers");

        ArrayList<String>drinksList=new ArrayList<>();
        drinksList.add("juice");
        drinksList.add("coffee");

        all.add(bakeryList);
        all.add(produceList);
        all.add(drinksList);

        System.out.println(all.get(1).get(2));
        System.out.println(all);
    }
}
