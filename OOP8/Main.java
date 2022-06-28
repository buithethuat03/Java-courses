abstract class Vehicle
{
    abstract void go();
}
class Cars extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("The driver is driving a car");
    }
}
public class Main {
    public static void main(String[] args)
    {
        //abstract =  abstract classes cannot be instantiated, but thay can have a subclasses
        //            abstract methods are declared without an implementation.
        Cars car = new Cars();
        car.go();
    }
}
