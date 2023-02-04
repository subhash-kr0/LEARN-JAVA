//Constructor in Java

 class Human {
    private int age;                 
    private String name;    

    public Human(){                               //this is contructor of human class 
        System.out.println("in Contructor");    //every time when object is creted construtor is called
    }

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
public class Tut43 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Rahul");
        System.out.println(obj.getAge() + " " + obj.getName());
    }
    
}