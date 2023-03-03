// While Loop in Java

public class Tut17 {
    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Nested While Loop
        int j = 0;
        while (j < 10) {
            int k = 0;
            while (k < 10) {
                int l = 0;
                while (l < 10) {
                    System.out.print(l);
                    l++;
                }
                System.out.println(k);
                k++;
            }
            System.out.println();
            j++;
        }
    }
    
}
