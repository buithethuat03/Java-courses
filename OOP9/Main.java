class Cars
{
    public String name;
    private String model;
    private int year;
    Cars(String name, String model, int year)
    {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getModel()
    {
        return this.model;
    }
    public void SetModel(String model)
    {
        this.model = model;
    }
    public int getYear()
    {
        return this.year;
    }
    public void SetYear(int year)
    {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args)
    {
        /*Encapsulation = attributes of a class will be hidden or private,
                        Can be accessed only through methods (getters & setters)
                        You should make attributes private if you don't have a reason to make them visibly  */ 

        Cars car = new Cars("Toyota","Camaro",2019);
        System.out.println(car.name);

        car.SetModel("Bihin");
        System.out.println(car.getModel());

        System.out.println(car.getYear());
    }
}
