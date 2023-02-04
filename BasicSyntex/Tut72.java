//Functional Interface New in Java

@FunctionalInterface
interface A{            // Functional Interface
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }

public class Tut72 {
    public static void main(String[] args) {
        // A a = new B();
        // a.show();

        A obj = new A(){
            public void show(){
                System.out.println("In Anonymous show");
            }
        };
        obj.show();
        }


    }
    