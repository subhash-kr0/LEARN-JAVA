// Wrapper Class in Java

public class Tut60 {
    public static void main(String a[]){
        int num = 7;     //primitive data Type
        // Integer num1 = new Integer(8);       //Refrence data type
        // Integer num1 = new Integer(num);     //Boxing
        // Integer num1 = num;                  //AutoBoxing
        Integer num2 = 8;

        // int num3 = num2.intValue();             //unboxing
        int num3 = num2;                          //Auto-unboxing

        System.out.println(num3);

        String str ="12";
        int num4 = Integer.parseInt(str);

        System.out.println(num4*2);
    }
    
}
