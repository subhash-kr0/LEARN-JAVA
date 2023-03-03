// method overloading in java

class Adder {

    public int add1(int a, int b) {
        return a + b;
    }

    static int add(int a, int b) {
        return a + b;
    }
    
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}

public class Tut25 {
    public static void main(String[] args) {

        Adder obj = new Adder();                           //Non-static method can be called only by creating object
        System.out.println(obj.add1(10, 20));

        System.out.println(Adder.add(10, 20));        //Static method can be called without creating object
        System.out.println(Adder.add(10, 20, 30));
        System.out.println(Adder.add(10.5, 20.5));
        System.out.println(Adder.add(10.5, 20.5, 30.5));
        System.out.println(Adder.add(10.5, 20.5, 30.5, 40.5));


        
    }
    
}
