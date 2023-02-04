// Ducking Exception using throws keyword in Java

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

class A{
    public void show(){
        try{
            Class.forName("Tut821");
          }
            catch(ClassNotFoundException e){
                System.out.println("Class not found");
            }
    }

    public void show1() throws MyException{
        throw new MyException("My Exception");
    }
}

public class Tut82 {

    static {
        System.out.println("In static block");
    }
    public static void main(String[] args) throws MyException {

    //   try{
    //     Class.forName("Tut821");
    //   }
    //     catch(ClassNotFoundException e){
    //         System.out.println("Class not found");
    //     }
    //     catch(Exception e){
    //         System.out.println("Something went wrong");
    //     }
    //     finally{
    //         System.out.println("Finally");
        // }


        A a = new A();
        a.show();
        a.show1();

    }
 }