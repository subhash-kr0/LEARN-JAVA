// Ducking Exception Using throws keyword in Java

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

class A{
    public void show() throws MyException{
        System.out.println("In A");
        throw new MyException("This is my exception");
    }

    public void show1() throws MyException{
        System.out.println("In A");
        throw new MyException("This is my exception");
    }
}

public class Tut82 {
    public static void main(String[] args) throws MyException {
        A a = new A();
        try{
            a.show();
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }

        A b = new A();
        b.show1();
        b.show();
    }
}