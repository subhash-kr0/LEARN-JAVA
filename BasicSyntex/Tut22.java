//Class and Object Practical in Java

class Calculator{
    public int add(int a, int b){
        return a + b;
    }
}

public class Tut22 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sum = c1.add(5, 6);
        System.out.println(sum);

    }
    
}
