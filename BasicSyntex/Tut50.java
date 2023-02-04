// Single and Multilevell inheritance in Java

class VeryAdvCalc extends AdvCalc{
    public int power(int n1, int n2){
        return (int) Math.pow(n1, n2);
    }
}

public class Tut50 {
    public static void main(String a[]){
        Tut49 n = new Tut49();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 4);
        int r5 = obj.power(4,2);

        System.out.println(r1+ " "+r2+ " "+ r3 + " "+ r4 + " "+ r5);

    }
}

//multilevel inheritance is work but multiple inheritance not work in Java