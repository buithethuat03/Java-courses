import java.util.Scanner;
class Animal
{
    public void speak()
    {
        System.out.println("The animal go *brrrrrrrr*");
    }
}
class Dog extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Bark");
    }
}
class Cat extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Meow");
    }
}
public class Main {
    public static void main(String[] args)
    {
        //  Polymorphism =  many shapes/forms.
        //  Dynamic =   after compilation (during runtime).
        
        //  ex. A corvette is a: corvette, and a car, and a vehicle, and an object.

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("What kind of animal do you want?\n(1)-Dog\t(2)-Cat");
        int choice =scanner.nextInt();
        if(choice == 1)
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2)
        {
            animal = new Cat();
            animal.speak();
        }
        else
        {
            animal = new Animal();
            animal.speak();
        }
        scanner.close();
    }
}
