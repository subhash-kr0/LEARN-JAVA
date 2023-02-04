//Abstract and Anonimous Inner Class

abstract class A{
    public abstract void show();
    public abstract void Config();
}

public class Tut64 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In show");
            }

            @Override
            public void Config() {
                System.out.println("In config");
                
            }
        };
        obj.show();
        obj.Config();
        
    }
    
}
