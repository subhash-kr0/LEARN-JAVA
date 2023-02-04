// Method Overriding in Java

class Calc {
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1 + n2 +1;
    }
}

public class Tut52 {
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        int r = obj.add(3,4);
        System.out.println(r);
    }
    
}
