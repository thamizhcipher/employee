public class Employee {
    String name;
    int age;
    String city;
    
   
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
    
    public static void main(String args[]) {
        
        
        Employee first  = new Employee();
        Employee second  = new Employee();
        first.name = "John";
        second.name = "Doe";
        first.age = 4;
        second.age = 8;
        first.city = "London";
        second.city = "Paris";
        
        first.display();
        second.display();
        
    }
}