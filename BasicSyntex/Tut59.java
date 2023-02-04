// upcasting and Downcasting in Java

class A{
     public void show1(){
        System.out.println("in A show");
     }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }

}

public class Tut59 {
    public static void main(String a[]){

        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i);

        A obj = (A) new B();     //Upcasting which is default set
        obj.show1();

        B obj1 = (B) obj;        //Downcasting
        obj1.show2();
    }    
}
