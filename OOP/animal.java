package OOP;

public class animal {
    String name;
    int age;

    animal(){}
    
    animal(String _name,int _age)
    {
        name=_name;
        age=_age;
    }
    
    void printInfo()
    {
        System.out.println("Type: animal, name: "+name+", age: "+age);
    }
}
