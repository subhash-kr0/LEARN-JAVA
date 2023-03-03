// Static Method in Java

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand +" "+ price +" "+ name);
    }

//     public static void show1(){
//         System.out.println("in static method");
//     }
// }

public static void show1(Mobile obj){
    System.out.println("in static method");
    System.out.println(obj.brand +" "+ obj.price +" "+ name);           //inside static method we can't access non-static variable
}

}

public class Tut39 {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 10000;
        Mobile.name = "Samsung Galaxy S10";
        m1.show();

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 20000;
        Mobile.name = "Apple iPhone 11";
        m2.show();

        Mobile.show1(m2);
        
    }
    
}
