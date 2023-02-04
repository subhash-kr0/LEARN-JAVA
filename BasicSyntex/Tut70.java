//Enum Class in Java
//Enum Class in Java

enum Laptop{
    Dell(100), HP(200), Lenovo(300), Apple(400), Acer, Asus(600);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
}

public class Tut70 {
    public static void main(String[] args) {
        Laptop l = Laptop.Apple;
        System.out.println(l + " " + l.getPrice());
        System.out.println(l.ordinal());
        Laptop[] l1 = Laptop.values();
        for(Laptop l2 : l1){
            System.out.println(l2 + " " + l2.getPrice() + " " + l2.ordinal());
        }
        

    }
    
}
