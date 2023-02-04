// This and Super Method in Java

class A {                 //class A extends Object(multilevel Inheritance)
    public A() {
        super();
        System.out.println("in A");
    }
    
    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }

    public B(int n) {
        // super(6);                          // n for calling "in A int"
        this();                               //this for calling same class contructor
        System.out.println("in B int");
    }
}

public class Tut45 {
    public static void main(String a[]){
        B obj = new B();
        B obj1 = new B(5);
    }

}
