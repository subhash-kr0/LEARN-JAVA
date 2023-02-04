//this keyword in Java


class Human {
    private int age;                 //here age is instance variable
    private String name;             //here name is instance variable
    public int getAge() {
        return age;
    }
    public void setAge(int age) {       //here age is local variable
        // public void setAge(int age, Human obj)
        // Human obj1 = obj;
        this.age = age;
    }
    public String getName() {           
        return name;
    }
    public void setName(String name) {       //here name is local variable
        this.name = name;
    }

    
}
public class Tut42 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Rahul");
        System.out.println(obj.getAge() + " " + obj.getName());
    }
    
}
