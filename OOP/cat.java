package OOP;

public class cat extends animal {
    cat(String _name,int _age)
    {
        name=_name;
        age=_age;
    }

    cat(){}
    
    void PrintInfo()
    {
        System.out.println("Type: Cat, name: "+name+", age: "+age);
    }
}
