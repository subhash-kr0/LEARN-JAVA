//Assignment Operator in Java

public class Tut9 {
    public static void main(String[] args) {

        // Assignment Operator
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // Arithmetic Operator
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // ShortHand Operator
        a += 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);

        // Increment Operator
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        // Relational Operator
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical Operator
        System.out.println(a > b && a < c);
        System.out.println(a > b || a < c);
        System.out.println(!(a > b));

        // Bitwise Operator
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);
        System.out.println(a >> 2);
        System.out.println(a >>> 2);

        // Ternary Operator
        int f = (a > b) ? a : b;
        System.out.println(f);

        // Type Casting Operator
        double g = 100.5;
        int h = (int) g;
        System.out.println(h);
        
    }
    
}
