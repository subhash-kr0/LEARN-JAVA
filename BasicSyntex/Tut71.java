// What is Annotation in Java?

class A{

    public void show(){
        System.out.println("In A");
    }
}

class B extends A{

    @Override                          // Annotation
    public void show(){
        System.out.println("In B");
    }
}

public class Tut71 {
    public static void main(String[] args) {
        A a = new B();
        a.show();

        //@Deprecated
        // @FunctionalInterface
        // @SafeVarargs
        // @Override
        // @Generated
        // @Native
        
    }
}
