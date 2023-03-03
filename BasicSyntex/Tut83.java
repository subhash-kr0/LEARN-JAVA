import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//User Input using BufferedReader and Scanner in java

public class Tut83 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the number");
        int num = System.in.read();

        System.out.println(num);
        System.out.println(num - 48);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num2 = br.read();
        int num3 = Integer.parseInt(br.readLine());
        System.out.println(num3);
        System.out.println(num2);

        br.close();


        Scanner sc = new Scanner(System.in);
        int num4 = sc.nextInt();
        System.out.println(num4);
        sc.close();
        
    }
    
}
