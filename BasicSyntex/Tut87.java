//thread priority in java

class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hii");
            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


public class Tut87 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
    
        System.out.println(a.getPriority());
    }
    
}
