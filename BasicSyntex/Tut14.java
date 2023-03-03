//Ternary Operator in java

public class Tut14 {
    public static void main(String[] args) {

        // Assignment Operator
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // Ternary Operator
        int f = (a > b) ? a : b;
        System.out.println(f);

        int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        
        System.out.println(result);

    }
    
}
