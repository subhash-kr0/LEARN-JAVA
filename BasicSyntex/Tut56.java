// Dynamic Method Dispatch in Java

    // Implementing run Time polymorphism by Dynamic Method Dispatch


class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
         System.out.println("in B show");
    }
}

class C extends B{
    public void show(){
        System.out.println("in C show");
    }

}
public class Tut56 {
    public static void main(String a[]){
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
}
