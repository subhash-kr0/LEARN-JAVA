//Enum if and Switch in Java

enum status{
    Running, Failed, Pendinng, Success;
}

public class Tut69 {
   public static void main(String[] args) {
         status s = status.Success;
         System.out.println(s);
         System.out.println(s.ordinal());
    
         status[] s1 = status.values();
         for(status s2 : s1){
              System.out.println(s2 + " " + s2.ordinal());
         }
    
         if(s == status.Success){
              System.out.println("Success");
         }
    
         switch(s){
                case Running:
                 System.out.println("Running");
                 break;
                case Failed:
                 System.out.println("Failed");
                 break;
                case Pendinng:
                 System.out.println("Pendinng");
                 break;
                case Success:
                 System.out.println("Success");
                 break;
         }

         status s2 = status.Pendinng;

           if(s2 == status.Success){
                System.out.println("Success");
           }
           else if(s2 == status.Pendinng){
                System.out.println("Pendinng");
           }
           else if(s2 == status.Failed){
                System.out.println("Failed");
           }
           else if(s2 == status.Running){
                System.out.println("Running");
           }
           else{
                System.out.println("Not Found");
           }
   }    
}
