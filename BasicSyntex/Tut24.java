// Methods in Java

class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getMePen(int cost){
        if (cost >= 10) 
           return "Pen";
        
        return "Nothing";
    }
}


public class Tut24 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String pen = obj.getMePen(10);
        System.out.println(pen);
        
    }
    
}
