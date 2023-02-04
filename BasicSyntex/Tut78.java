//Try with multiple catch blocks in Java

public class Tut78 {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        // catch(Exception e){             //all exceptions catched by this block
        //     System.out.println("Can not divide by zero" + e);
        // }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}
