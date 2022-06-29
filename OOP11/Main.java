interface Prey
{
    void flee();//Only declare, not defined
}

interface Predator
{
    void hunt();
}
class Rabbit implements Prey
{
    @Override
    public void flee()
    {
        System.out.println("The rabbit is fleeing");
    }
}

class Hawk implements Predator
{
    @Override
    public void hunt()
    {
        System.out.println("The Hawk is hunting");
    }
}

class Fish implements Prey,Predator
{
    @Override
    public void hunt()
    {
        System.out.println("The Fish is hunting a smaill fish");
    }

    @Override
    public void flee()
    {
        System.out.println("The Fish is fleeing from a large fish");
    }
}
public class Main {
    public static void main(String[] args)
    {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
