// Lambda Expression with return in Java

@FunctionalInterface               //Lambda onnly work with Functional Interface
interface  A{
    int add(int a, int b);
}

public class Tut74 {
    public static void main(String[] args) {

        A obj = (a, b) -> {
            System.out.println("In Lambda Expression " + (a+b));
            return a+b;
        };   
        obj.add(5, 6);

        A obj1 = (a, b) -> (a+b);   //if only one parameter then we can remove the brackets
        System.out.println(obj1.add(5, 6));

        A obj2 = (i,j) -> i + j;
        System.out.println(obj2.add(5, 6));

        A obj3 = (i,j) -> {
            return i + j;
        };
        System.out.println(obj3.add(5, 6));
        
    }
    
}
