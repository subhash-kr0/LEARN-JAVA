import java.lang.reflect.Type;

// Final Keyword in Java

//final -> varialbe, class , Method

final class Calc{
    public final void show(){             //here by using final keyword no one can overwrite it
        System.out.println("in Calc Show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{       //can not inherit final class its give you error

// }

public class Tut57 {
    public static void main(String a[]){

        final int num = 8;     // now it is Constant we cant change it
        System.out.println(num);
    }
    
}
