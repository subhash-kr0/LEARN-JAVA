// Default vs Parameterized Constructor

class Human {
    private int age;                 
    private String name;    

    public Human(){                               //Default Contructor
        System.out.println("in Contructor");    //every time when object is creted construtor is called
    }

    public Human(int age, String name) {           //Parametrized Constructor
        this.age = age;                             //multiple Contruct is known as Method overloading
        this.name = name;
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
public class Tut44 {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18,"Aman");
        obj.setAge(12);
        obj.setName("Rahul");
        System.out.println(obj.getAge() + " " + obj.getName());
        System.out.println(obj1.getAge() + " " + obj1.getName());
    }
    
}

