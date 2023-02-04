// Inner class in Java

class A{
    int age;

    public void show(){
        System.out.println("In A");
    }

    public void config(){
        System.out.println("In config A");
    }

    class B extends A{
        public void config(){
            System.out.println("In config B");
        }
    }

    static class C{
        public void config(){
            System.out.println("In config C");
        }
    }
}

public class Tut62 {
    public static void main(String[] args) {
        A obj = new A();
        // obj.show();
        obj.config();
        A.B obj1 = obj.new B();
        obj1.config();
        
        A.C obj2 = new A.C();   //only when class is static
        obj2.config();
    }
}
//static class only work inner class