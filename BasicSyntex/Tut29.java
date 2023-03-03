import java.util.Arrays;



// Multi-Dimensional Arrays in Java

public class Tut29 {
    public static void main(String[] args) {
        int[][] marks = new int[2][3];
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;
        marks[1][0] = 40;
        marks[1][1] = 50;
        marks[1][2] = 60;

        System.out.println(marks[0][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);
        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[1][2]);

        // Another way of creating a multi-dimensional array
        int[][] marks2 = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(marks2[0][0]);
        System.out.println(marks2[0][1]);
        System.out.println(marks2[0][2]);
        System.out.println(marks2[1][0]);
        System.out.println(marks2[1][1]);
        System.out.println(marks2[1][2]);

        // Print all the elements of a multi-dimensional array
        // for (int i = 0; i < marks.length; i++) {
        //     for (int j = 0; j < marks[i].length; j++) {
        //         System.out.println(marks[i][j]);
        //     }
        // }

        // Print all the elements of a multi-dimensional array using for-each loop
        // for (int[] element : marks) {
        //     for (int item : element) {
        //         System.out.println(item);
        //     }
        // }

        // Print all the elements of a multi-dimensional array using while loop
        // int i = 0;
        // while (i < marks.length) {
        //     int j = 0;
        //     while (j < marks[i].length) {
        //         System.out.println(marks[i][j]);
        //         j++;
        //     }
        //     i++;
        // }

        // Print all the elements of a multi-dimensional array using do-while loop
        // int k = 0;
        // do {
        //     int l = 0;
        //     do {
        //         System.out.println(marks[k][l]);
        //         l++;
        //     } while (l < marks[k].length);
        // } while (k < marks.length);

        // Print all the elements of a multi-dimensional array in reverse order
        // for (int m = marks.length - 1; m >= 0; m--) {
        //     for (int n = marks[m].length - 1; n >= 0; n--) {
        //         System.out.println(marks[m][n]);
        //     }
        // }

        // Print all the elements of a multi-dimensional array in reverse order using for-each loop
        for (int[] element : marks) {
            for (int item : element) {
                System.out.println(item);
            }
        }
        
        // Print all the elements of a multi-dimensional array in one line of code
        for (int[] element : marks) {
            System.out.println(Arrays.toString(element));
        }

        // Print all the elements of a multi-dimensional array in one line of code
        System.out.println(Arrays.deepToString(marks));

        // // reverse the elements of a multi-dimensional array in one line of code
        // for (int[] element : marks) {
        //     for (int item : element) {
        //         System.out.println(item);
        //     }
        // }   
        
        // 3D Array with random numbers
        int[][][] marksA = new int[2][3][4];
        for (int i = 0; i < marksA.length; i++) {
            for (int j = 0; j < marksA[i].length; j++) {
                for (int k = 0; k < marksA[i][j].length; k++) {
                    marksA[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        
        for (int[][] element : marksA) {
            for (int[] item : element) {
                for (int value : item) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }

        // 3D Array
        int[][][] marks3 = new int[2][3][4];
        marks3[0][0][0] = 10;
        marks3[0][0][1] = 20;
        marks3[0][0][2] = 30;
        marks3[0][0][3] = 40;
        marks3[0][1][0] = 50;
        marks3[0][1][1] = 60;  
        marks3[0][1][2] = 70;
        marks3[0][1][3] = 80;
        marks3[0][2][0] = 90;
        marks3[0][2][1] = 100;
        marks3[0][2][2] = 110;
        marks3[0][2][3] = 120;
        marks3[1][0][0] = 130;
        marks3[1][0][1] = 140;
        marks3[1][0][2] = 150;
        marks3[1][0][3] = 160;
        marks3[1][1][0] = 170;
        marks3[1][1][1] = 180;
        marks3[1][1][2] = 190;
        marks3[1][1][3] = 200;
        marks3[1][2][0] = 210;
        marks3[1][2][1] = 220;
        marks3[1][2][2] = 230;
        marks3[1][2][3] = 240;
    

        // Print all the elements of a 3D array
        for (int[][] element : marks3) {
            for (int[] item : element) {
                for (int value : item) {
                    System.out.println(value);
                }
                System.out.println("**********");
            }
        }

        // 4D Array
        int[][][][] marks4 = new int[2][3][4][5];
         
        // Print all the elements of a 4D array
        for (int[][][] element : marks4) {
            for (int[][] item : element) {
                for (int[] value : item) {
                    for (int num : value) {
                        System.out.print(num);
                    }
                    System.out.println();
                    // System.out.println("**********");
                }
                System.out.println("**********");
            }
        }
    }
    
}
