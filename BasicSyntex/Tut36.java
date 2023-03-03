// StringBuffer and StringBuilder in Java

public class Tut36 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.append(" Java");
        System.out.println(sb);
        sb.insert(1, "Java");
        System.out.println(sb);
        sb.replace(1, 3, "Python");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);
        sb.setLength(0);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);

        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2);
        sb2.append(" World");
        System.out.println(sb2);
        sb2.append(" Java");
        System.out.println(sb2);
        sb2.insert(1, "Java");
        System.out.println(sb2);
        sb2.replace(1, 3, "Python");
        System.out.println(sb2);
        sb2.delete(1, 3);
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        sb2.setLength(5);
        System.out.println(sb2);
        sb2.setLength(10);
        System.out.println(sb2);

        System.out.println(sb2.capacity());
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());

        System.out.println(sb2.length());

        String str2 = sb2.toString();
        System.out.println(str2);


        // String vs StringBuffer vs StringBuilder
        // String is immutable
        // StringBuffer is mutable
        // StringBuilder is mutable
        // StringBuffer is thread safe
        // StringBuilder is not thread safe
        // StringBuffer is slower than StringBuilder
        // StringBuilder is faster than StringBuffer
        // StringBuffer is synchronized
        // StringBuilder is not synchronized
        // StringBuffer is used in multi-threading
        // StringBuilder is used in single-threading

    }
    
}
