package OOP;

public class dog extends animal{
    dog(){}

    dog(String _name,int _age)
    {
        name=_name;
        age=_age;
    }

    void printInfo()
    {
        System.out.println("Type: Dog, name: "+name+", age: "+age);
    }
}
