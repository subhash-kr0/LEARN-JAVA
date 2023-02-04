// Exception throw keyword in Java

public class Tut80 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("Can not divide by zero");

        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("That the defsult value");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        // finally{
        //     System.out.println("Finally");
        // }
        System.out.println(j);
        System.out.println("Bye");
        }
    }
    
