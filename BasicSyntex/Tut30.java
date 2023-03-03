//Jagged and 3D Array in java

public class Tut30 {
    public static void main(String[] args) {
            
            //Jagged Array
            int[][] arr = new int[3][];
            arr[0] = new int[3];
            arr[1] = new int[4];
            arr[2] = new int[2];
            
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = count;
                    count++;
                }
            }
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            //using for-each loop
            for(int n[] : arr){
                for(int m : n){
                    System.out.println(m + " ");
                }
                System.out.println();
            }
            
            //3D Array
            int[][][] arr3D = new int[3][3][3];
            int count3D = 0;
            for (int i = 0; i < arr3D.length; i++) {
                for (int j = 0; j < arr3D[i].length; j++) {
                    for (int k = 0; k < arr3D[i][j].length; k++) {
                        arr3D[i][j][k] = count3D;
                        count3D++;
                    }
                }
            }
            
            for (int i = 0; i < arr3D.length; i++) {
                for (int j = 0; j < arr3D[i].length; j++) {
                    for (int k = 0; k < arr3D[i][j].length; k++) {
                        System.out.print(arr3D[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
    }
    
}
