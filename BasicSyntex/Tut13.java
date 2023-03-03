//If else if in java

public class Tut13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // If else if ladder
        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("B is greater than A");
        } else {
            System.out.println("A is equal to B");
        }

        // Nested if else
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater than B and C");
            } else {
                System.out.println("C is greater than A and B");
            }
        } else {
            if (b > c) {
                System.out.println("B is greater than A and C");
            } else {
                System.out.println("C is greater than A and B");
            }
        }

        if(a > b && a > c){
            System.out.println("A is greater than B and C");
        } else if(b > a && b > c){
            System.out.println("B is greater than A and C");
        } else if(c > a && c > b){
            System.out.println("C is greater than A and B");
        } else {
            System.out.println("A, B and C are equal");
        }

    }
    
}
