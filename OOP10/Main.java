class Cars
{
    private String name;
    private String model;
    private int year;
    Cars(String name, String model, int year)
    {
        setName(name);
        setModel(model);
        setYear(year);
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setModel(String model)
    {
        this.model = model;
    }
    void setYear(int year)
    {
        this.year = year;
    }
    String getName()
    {
        return this.name;
    }
    String getModel()
    {
        return this.model;
    }
    int getYear()
    {
        return this.year;
    }
    void copy(Cars other)
    {
        setName(other.getName());
        setModel(other.getModel());
        setYear(other.getYear());
    }
}

public class Main {
    public static void main(String[] args)
    {
        Cars car1=new Cars("Ford","Mustang",2022);
        Cars car2=new Cars("Chevrolet","Camaro",2021);
        System.out.println(car1);
        System.out.println(car2);
        //  car1=car2; copy address from car1 to car2 so both car1 and car2 are the same address.
        //Solution: definition method in class Cars "copy": only copy data, not address.
        car2.copy(car1);
        System.out.println(car1);
        System.out.println(car2);
    }
}
