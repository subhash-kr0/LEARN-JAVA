//What is Enum in Java?

enum status{
    Running, Failed, Pendinng, Success;
}

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class Tut68 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        status s = status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        status[] s1 = status.values();
        for(status s2 : s1){
            System.out.println(s2 + " " + s2.ordinal());
        }
    }
}
