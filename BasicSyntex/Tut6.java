// Data Types in Java

// Primitive Data Types
// int
// float
// double
// char
// boolean
// byte
// short
// long
// uint
// ulong
// ushort
// sbyte

// Non-Primitive Data Types
// String
// Array
// Class
// Interface
// Enum
 
//Range of primitive data types
// byte -> -128 to 127
// short -> -32768 to 32767
// int -> -2147483648 to 2147483647
// long -> -9223372036854775808 to 9223372036854775807
// float -> 1.4e-45 to 3.4028235e+38
// double -> 4.9e-324 to 1.7976931348623157e+308
// char -> 0 to 65535
// boolean -> true or false

// Default value of primitive data types
// byte -> 0
// short -> 0
// int -> 0
// long -> 0
// float -> 0.0
// double -> 0.0
// char -> '\u0000'
// boolean -> false

// Default value of non-primitive data types
// String -> null
// Array -> null
// Class -> null
// Interface -> null
// Enum -> null

// Type Casting
// Widening Casting (Automatic) -> byte -> short -> int -> long -> float -> double
// Narrowing Casting (Manual) -> double -> float -> long -> int -> short -> byte

// Type Conversion
// Widening Conversion (Automatic) -> byte -> short -> int -> long -> float -> double
// Narrowing Conversion (Manual) -> double -> float -> long -> int -> short -> byte

// Type Promotion
// Widening Promotion (Automatic) -> byte -> short -> int -> long -> float -> double
// Narrowing Promotion (Manual) -> double -> float -> long -> int -> short -> byte

// Type Casting vs Type Conversion vs Type Promotion
// Type Casting -> byte -> short -> int -> long -> float -> double
// Type Conversion -> double -> float -> long -> int -> short -> byte
// Type Promotion -> double -> float -> long -> int -> short -> byte


public class Tut6 {
    public static void main(String[] args) {

        // Widening Casting (Automatic) -> byte -> short -> int -> long -> float -> double
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        System.out.println("Widening Casting (Automatic) -> byte -> short -> int -> long -> float -> double");
        System.out.println("byte a = 10;");
        System.out.println("short b = a;");
        System.out.println("int c = b;");
        System.out.println("long d = c;");
        System.out.println("float e = d;");
        System.out.println("double f = e;");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println();

        // Narrowing Casting (Manual) -> double -> float -> long -> int -> short -> byte
        double g = 10.5;
        float h = (float)g;
        long i = (long)h;
        int j = (int)i;
        short k = (short)j;
        byte l = (byte)k;
        System.out.println("Narrowing Casting (Manual) -> double -> float -> long -> int -> short -> byte");
        System.out.println("double g = 10.5;");
        System.out.println("float h = (float)g;");
        System.out.println("long i = (long)h;");
        System.out.println("int j = (int)i;");
        System.out.println("short k = (short)j;");
        System.out.println("byte l = (byte)k;");
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println();
        
    }
    
}
