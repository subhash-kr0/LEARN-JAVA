//Encapsulation in Java

class Human {
    private int age = 11;
    private String name = "Navin";

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class Tut40 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getAge() + " " + obj.getName());

        obj.setAge(12);
        obj.setName("Rahul");
        System.out.println(obj.getAge() + " " + obj.getName());
    
    }
}