
class Animals
{
    void speak()
    {
        System.out.println("The animal speaks");
    }
}
class Dog extends Animals
{
    @Override
    void speak()
    {
        System.out.println("The dog speaks");
    }
}
public class Main {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.speak();
    }
}
