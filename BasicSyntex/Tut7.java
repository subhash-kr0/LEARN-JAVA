//Literal in Java

// Literal in Java
// 1. Integer Literal
// 2. Floating Literal
// 3. Boolean Literal
// 4. Character Literal
// 5. String Literal
// 6. Null Literal


public class Tut7 {
    public static void main(String[] args) {

        int n1 = 10_000_000;
        int n2 = 0b1010_1010_1010_1010;
        System.out.println(n1 + " " + n2);

        double d1 = 10.5_5;
        double d2 = 12e10;
        System.out.println(d1 + " " + d2);

        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = (char) (c1 +1);
        System.out.println(c1 + " " + c2);

        

        // Integer Literal
        int a = 10;
        int b = 0b1010;
        int c = 012;
        int d = 0xA;
        System.out.println("Integer Literal");
        System.out.println("int a = 10;");
        System.out.println("int b = 0b1010;");
        System.out.println("int c = 012;");
        System.out.println("int d = 0xA;");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println();

        // Floating Literal
        float e = 10.5f;
        float f = 10.5F;
        double g = 10.5;
        double h = 10.5D;
        double i = 10.5d;
        System.out.println("Floating Literal");
        System.out.println("float e = 10.5f;");
        System.out.println("float f = 10.5F;");
        System.out.println("double g = 10.5;");
        System.out.println("double h = 10.5D;");
        System.out.println("double i = 10.5d;");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println();

        // Boolean Literal
        boolean j = true;
        boolean k = false;
        System.out.println("Boolean Literal");
        System.out.println("boolean j = true;");
        System.out.println("boolean k = false;");
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println();

        // Character Literal
        char l = 'A';
        char m = 'B';
        char n = '\u0041';
        char o = '\u0042';
        System.out.println("Character Literal");
        System.out.println("char l = 'A';");
        System.out.println("char m = 'B';");
        System.out.println("char n = '\\u0041';");
        System.out.println("char o = '\\u0042';");
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println();

        // String Literal
        String p = "Hello";
        String q = "World";
        System.out.println("String Literal");
        System.out.println("String p = \"Hello\";");
        System.out.println("String q = \"World\";");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println();

        // Null Literal
        String r = null;
        System.out.println("Null Literal");
        System.out.println("String r = null;");
        System.out.println("r = " + r);
        System.out.println();

        // Array Literal
        int[] s = {1, 2, 3, 4, 5};
        System.out.println("Array Literal");
        System.out.println("int[] s = {1, 2, 3, 4, 5};");
        System.out.println("s = " + s);
        System.out.println();

        // Object Literal
        Mobile t = new Mobile();
        System.out.println("Object Literal");
        System.out.println("Mobile t = new Mobile();");
        System.out.println("t = " + t);
        System.out.println();
        
    }
}
