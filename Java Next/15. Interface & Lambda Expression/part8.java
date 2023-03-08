// Lambda Expression

@FunctionalInterface
interface Car {
    void drive();

    interface Bike {
        void start();

        interface Cycle {
            void workout();
        }
    }

    interface Truck {
        void drive();
    }

}

@FunctionalInterface
interface add {
    int add(int a, int b);

    interface mul {
        int multi(int a, int b);

    }

    class A implements add{
        public int add(int a, int b){
            return a+b;
        };
    }
}

public class part8 {
    public static void main(String[] args) {

        Car obj = new Car() {
            public void drive() {
                System.out.println("Driving");
            }
        };
        obj.drive();

        Car obj2 = () -> System.out.println("Driving"); // Lambda Expression
        obj2.drive();
        // _________________________________________________________________________

        add obj3 = (int a, int b) -> a + b+1;
        System.out.println(obj3.add(5, 6));

        add obj4 = (a, b) -> a + b;
        System.out.println(obj4.add(5, 6));
        // ___________________________________________________________________________

        Car.Bike obj5 = new Car.Bike() {
            public void start() {
                System.out.println("Bike is Running");
            }
        };
        obj5.start();

        Car.Bike obj6 = () -> System.out.println("Bike is Running 2");
        obj6.start();
        // ____________________________________________________________________________

        Car.Bike.Cycle obj7 = () -> System.out.println("In bycycle");
        obj7.workout();
        // ____________________________________________________________________________

        Car.Truck obj8 = () -> System.out.println("Truck is going");
        obj8.drive();
        // ____________________________________________________________________________

        add.mul obj9 = (int a, int b) -> a * b;
        System.out.println(obj9.multi(5, 5));

        add.A obj10 = new add.A();
        System.out.println(obj10.add(12, 20));


        add.A obj11 = new add.A();
        
    }

}