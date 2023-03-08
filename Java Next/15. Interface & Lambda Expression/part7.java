// Annonymous Inner Class

interface Car{
    void drive();
}

public class part7 {
    public static void main(String[] args) {
        
        Car obj = new Car(){           // Annonymous Inner Class
            public void drive(){
                System.out.println("Driving ...");
            }
        };
        obj.drive();
    }
    
}