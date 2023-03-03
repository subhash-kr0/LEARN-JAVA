//If else statement in java

public class Tut12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // If else statement
        if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }

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

    }
    
}
