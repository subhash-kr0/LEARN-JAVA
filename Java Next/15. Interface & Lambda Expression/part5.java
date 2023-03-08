// Java 8 features

// Lambda Expression
// Functional Interface
// Method Reference
// Default Method
// Static Method
// Stream API
// Date Time API


interface A{
    void show();

    default void config(){
        System.out.println("Default Method");
    }

    static void abc(){
        System.out.println("Static Method");
    }

}

class B implements A{
    public void show(){
        System.out.println("In B");
    }
}

public class part5 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        A.abc();

        // Lambda Expression
        A obj2 = () -> System.out.println("In B");
        obj2.show();
        obj2.config();
        A.abc();
    }    
}