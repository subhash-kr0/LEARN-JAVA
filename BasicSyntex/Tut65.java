//Need of Interface in Java

abstract class Computer{
    public abstract void code(); 
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code in laptop");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code in desktop");
    }
}

class Programmer{
    public void doCoding(Computer lap){
        lap.code();
    }
}

public class Tut65 {
    public static void main(String[] args) {
        Computer Lap = new Laptop();
        Computer desk = new Desktop();

        Programmer obj = new Programmer();
        obj.doCoding(Lap);
        obj.doCoding(desk);
        

    }
}