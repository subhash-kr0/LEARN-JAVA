//Race Condition in Java

class counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

public class Tut89 {
    public static void main(String[] args) throws InterruptedException {
        // counter c = new counter();
        // Thread t1 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 1000; i++) {
        //             c.increment();
        //         }
        //     }
        // });
        // Thread t2 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 1000; i++) {
        //             c.increment();
        //         }
        //     }
        // });
        // t1.start();
        // t2.start();
        // t1.join();
        // t2.join();
        // System.out.println("Count is: " + c.count);

        counter c = new counter();

        Runnable obj1 = () ->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () ->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count is: " + c.count);
        }
    }
    
