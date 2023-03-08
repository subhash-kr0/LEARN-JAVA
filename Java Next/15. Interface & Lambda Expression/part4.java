// Abstract vs Interface

// Abstract class can have abstract and non-abstract methods.
// Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
// Abstract class doesn't support multiple inheritance.
// Interface supports multiple inheritance.
// Abstract class can have final, non-final, static and non-static variables.
// Interface has only static and final variables.
// Abstract class can provide the implementation of interface.
// Interface can't provide the implementation of abstract class.
// The abstract keyword is used to declare abstract class.
// The interface keyword is used to declare interface.
// Example of abstract class:
// abstract class Shape{
//     abstract void draw();
// }
// Example of interface:
// interface Drawable{
//     void draw();
// }

abstract class Shape{
    abstract void draw();
}

interface Drawable{
    void draw();
}

public class part4 {
    public static void main(String[] args) {
        Shape obj = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing");
            }
        };
        obj.draw();

        Drawable obj2 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing");
            }
        };
        obj2.draw();
    }
}
