//Custom Exception in Java

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class Tut81 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0)
                throw new MyException("Can not divide by zero");

        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("That the defsult value" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }
        // finally{
        //     System.out.println("Finally");
        // }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}
