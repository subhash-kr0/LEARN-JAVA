//What is Interface in Java?

interface A{

    int age = 10;   //public static final int age = 10;
    String name = "Mumbai"; //public static final String name = "Mumbai";

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
        
    }
}

public class Tut66 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        

        System.out.println(A.age);
        System.out.println(A.name);
    }
    
}
