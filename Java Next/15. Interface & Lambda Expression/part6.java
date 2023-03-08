// Inner Class

                   // inner - member , static and Annonyous

class A{

    int age;
    String name;
    Address address;

    class Address{
        String city;
        String state;
        String country;
    }


    public void show(){
        System.out.println("In A");
    }

    class B{
        public void show(){
            System.out.println("In B");
        }
    }

    static class C{
        public void show(){
            System.out.println("In C");
        }
    }
}

public class part6 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.show();

        // Alternative to create inner class object
        A.B obj3 = new A().new B();
        obj3.show();

        // Static Inner Class
        A.C obj4 = new A.C();
        obj4.show();


    }
}
