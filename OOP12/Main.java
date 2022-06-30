class Vehicle
{
    public void go()
    {

    }
}
class Car extends Vehicle
{
    @Override
    public void go()
    {
        System.out.println("The car is going");
    }
}
class Boat extends Vehicle
{
    @Override
    public void go()
    {
        System.out.println("The Boat is going");
    }
}
class Bycicle extends Vehicle
{
    @Override
    public void go()
    {
        System.out.println("The Bycicle is going");
    }
}

public class Main {
    public static void main(String[] args)
    {
        //polymorphism =    greek word for poly-"many", morph-"form"
        //                  The ability of an object to identify as more than one types.
    
        Car car = new Car();
        Bycicle bicycle = new Bycicle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};
        for(Vehicle vehicle : racers)
        {
            vehicle.go();
        }
    }    
}
