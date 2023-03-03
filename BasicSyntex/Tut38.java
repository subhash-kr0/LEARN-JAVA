// Static Block in Java

class Mobile{
    String brand;
    int price;
    static String name;          // static variable same for all
    static{
        System.out.println("This is static block");
        name = "iPhone 12";
    }
}

public class Tut38 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 100000;
        m1.name = "iPhone 12";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 50000;
        m2.name = "Galaxy S21";

        System.out.println(m1.brand);
        System.out.println(m1.price);
        System.out.println(m1.name);

        System.out.println(m2.brand);
        System.out.println(m2.price);
        System.out.println(Mobile.name);     //static varible can call by class name
    }
    
}
