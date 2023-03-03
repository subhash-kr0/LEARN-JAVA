// Variables in Java

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

public class Tut5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        float d = 10.5f;
        float e = 20.5f;
        float f = d + e;
        System.out.println(f);

        double g = 10.5;
        double h = 20.5;
        double i = g + h;
        System.out.println(i);

        char j = 'A';
        char k = 'B';
        char l = (char)(j + k);
        System.out.println(l);

        boolean m = true;
        boolean n = false;
        boolean o = m && n;
        System.out.println(o);

        byte p = 10;
        byte q = 20;
        byte r = (byte)(p + q);
        System.out.println(r);

        short s = 10;
        short t = 20;
        short u = (short)(s + t);
        System.out.println(u);

        long v = 10;
        long w = 20;
        long x = v + w;
        System.out.println(x);

        String y = "Hello";
        String z = "World";
        String aa = y + z;
        System.out.println(aa);

        int[] ab = {1, 2, 3, 4, 5};
        System.out.println(ab[0]);
        System.out.println(ab[1]);
        System.out.println(ab[2]);
        System.out.println(ab[3]);
        System.out.println(ab[4]);

        int[] ac = new int[5];
        ac[0] = 1;
        ac[1] = 2;
        ac[2] = 3;
        ac[3] = 4;
        ac[4] = 5;
        System.out.println(ac[0]);
        System.out.println(ac[1]);
        System.out.println(ac[2]);
        System.out.println(ac[3]);
        System.out.println(ac[4]);

        int[] ad = new int[]{1, 2, 3, 4, 5};
        System.out.println(ad[0]);
        System.out.println(ad[1]);

    }

}
