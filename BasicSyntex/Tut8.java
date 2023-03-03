// Type Conversion in Java

public class Tut8 {
    public static void main(String[] args) {

        // Implicit Type Conversion   //  byte -> short -> int -> long -> float -> double
        int a = 10;
        float b = a;
        System.out.println(b);

        // Explicit Type Conversion    //  double -> float -> long -> int -> short -> byte 
        float c = 10.5f;
        int d = (int) c;
        System.out.println(d);

        // String to int
        String e = "100";
        int f = Integer.parseInt(e);
        System.out.println(f);

        // int to String
        int g = 100;
        String h = Integer.toString(g);
        System.out.println(h);

        // String to float
        String i = "100.5";
        float j = Float.parseFloat(i);
        System.out.println(j);

        // float to String
        float k = 100.5f;
        String l = Float.toString(k);
        System.out.println(l);

        // String to char
        String m = "A";
        char n = m.charAt(0);
        System.out.println(n);

        // char to String
        char o = 'A';
        String p = Character.toString(o);
        System.out.println(p);

        // String to boolean
        String q = "true";
        boolean r = Boolean.parseBoolean(q);
        System.out.println(r);

        // boolean to String
        boolean s = true;
        String t = Boolean.toString(s);
        System.out.println(t);

        // double to int
        double u = 100.5;
        int v = (int) u;
        System.out.println(v);

        // int to double
        int w = 100;
        double x = w;
        System.out.println(x);

        // char to int
        char y = 'A';
        int z = y;
        System.out.println(z);

        // int to char
        int aa = 65;
        char bb = (char) aa;
        System.out.println(bb);


        
    }
    
}
