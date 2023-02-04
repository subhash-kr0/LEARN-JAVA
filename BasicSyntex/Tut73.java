// Lambda Expression in Java

@FunctionalInterface
interface A{
    void show(int i);
}

public class Tut73 {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In Anonymous show");
        //     }
        // };
        // obj.show();

        A obj = (i) -> System.out.println("In Lambda Expression " + i);   
        obj.show(5);

        A obj1 = i -> System.out.println("In Lambda Expression " + i);   //if only one parameter then we can remove the brackets
        }
    }
