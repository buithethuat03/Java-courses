class human
{
    String name;
    int age;

    human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    human(){};
    public String toString()
    {
        return name+'\n'+age+'\n';
    }
}

class hero extends human
{
    String power;
    hero(String name, int age,String power)
    {
        //super: methods in parent class
        super(name, age);
        this.power = power;
    }
    public String toString()
    {
        return super.toString()+this.power;
    }

}
public class Main {
    public static void main(String []args)
    {
        hero superman=new hero("Superman",43,"everything");
        System.out.println(superman.toString());
    }
}
