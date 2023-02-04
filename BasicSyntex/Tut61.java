// Abstract Keyword in Java

abstract class Car{
    public abstract void drive();       //Abstract method

    public void playMusic(){
        System.out.println("play music");
    }
}

class WagonR extends Car{              //extends car class not work if not difine same method
    public void drive(){
        System.out.println("drive WagonR");
    }
}

public class Tut61 {
  public static void main(String[] args) {
    Car obj = new WagonR();
    obj.drive();
    obj.playMusic();
    
  }
}
