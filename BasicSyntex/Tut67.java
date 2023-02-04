//More on Interfaces in Java


//class - class -> extends
//class - interface -> implements
//interface - interface -> extends
interface A{

    int age = 10;   //public static final int age = 10;
    String name = "Mumbai"; //public static final String name = "Mumbai";

    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends A,X{
    void watch();
}

class B implements Y{
    public void show(){
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
        
    }

    @Override
    public void run() {
        System.out.println("In run");
        
    }

    @Override
    public void watch() {
        System.out.println("In watch");
        
    }
}

public class Tut67 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        Y obj2 = new B();
        obj2.watch();
        

        System.out.println(A.age);
        System.out.println(A.name);

        
    }
    
}
