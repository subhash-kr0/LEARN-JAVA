//Anonimous Inner Class

class A{
    int age;

    public void show(){
        System.out.println("In A");
    }

    public void config(){
        System.out.println("In config A");
    }

    class B extends A{
        public void config(){
            System.out.println("In config B");
        }
    }

    static class C{
        public void config(){
            System.out.println("In config C");
        }
    }
}

public class Tut63 {
    public static void main(String[] args) {
        A obj = new A(){
            public void config(){
                System.out.println("In config D");
            }
        };
        obj.config();

        A obj1 = new A();
        obj1.config();

        A obj2 = new A(){
            public void config(){
                System.out.println("In config E");
            }
        };
        
    }
}
