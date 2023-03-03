//Runnable vs Thread in java

//thread priority in java

class A implements Runnable{
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


class B implements Runnable {
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

public class Tut88 {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        
    }
    
}
