// Switch Statement in Java

public class Tut15 {
    public static void main(String[] args) {

        // Assignment Operator
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // Switch Statement
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
    
}
