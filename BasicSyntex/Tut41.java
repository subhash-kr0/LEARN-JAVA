// Gettwes and Setters in Java

class Human {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class Tut41 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Rahul");
        System.out.println(obj.getAge() + " " + obj.getName());
    }
    
}
