// Exception Handling Using try-catch-finally

public class Tut77 {
    public static void main(String[] args) {
        
        try{
            int a = 5/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finally");
        }

        
    }
    
}
