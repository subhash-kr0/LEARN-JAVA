// What is String in Java
//
// String is a sequence of characters
// String is a class in Java
// String is immutable
// String is a final class
// String is a non-primitive data type
// String is a reference data type
// String is a collection of characters
// String is a sequence of characters
// String is a sequence of bytes
// String is a sequence of Unicode characters
// String is a sequence of UTF-16 code units


public class Tut34 {
    public static void main(String[] args) {

        String name = "Harry Potter";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(1, 4));
        System.out.println(name.substring(2, 5));
        System.out.println(name.substring(3, 6));
        System.out.println(name.hashCode());

    }
    
}
