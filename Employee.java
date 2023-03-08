
public class Employee {
    int id;
    String name;
    String city;
    Employee(int id,String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+city;
    }
}
