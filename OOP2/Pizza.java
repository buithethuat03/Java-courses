package OOP2;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(){}
    Pizza(String bread)
    {
        this.bread=bread;
    }
    Pizza(String bread,String sauce)
    {
        this.bread=bread;
        this.sauce=sauce;
    }
    Pizza(String bread,String sauce,String cheese)
    {
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
    }
    Pizza(String bread,String sauce,String cheese,String topping)
    {
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.topping=topping;
    }
    void printInfo()
    {
        System.out.println(this.bread);
        System.out.println(this.sauce);
        System.out.println(this.cheese);
        System.out.println(this.topping);
    }
}
