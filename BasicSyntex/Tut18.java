// Do While Loop

public class Tut18 {
    public static void main(String[] args) {
        // Do While Loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        // Nested Do While Loop
        int j = 0;
        do {
            int k = 0;
            do {
                int l = 0;
                do {
                    System.out.print(l);
                    l++;
                } while (l < 10);
                System.out.println(k);
                k++;
            } while (k < 10);
            System.out.println();
            j++;
        } while (j < 10);

        // Do While Loop with break
        int m = 0;
        do {
            System.out.println(m);
            m++;
            if (m == 5) {
                break;
            }
        } while (m < 10);

        // Double Do While Loop with break
        int n = 0;
        do {
            int o = 0;
            do {
                System.out.print(o);
                o++;
                if (o == 5) {
                    break;
                }
            } while (o < 10);
            System.out.println();
            n++;
        } while (n < 10);
        
    }
    
}
