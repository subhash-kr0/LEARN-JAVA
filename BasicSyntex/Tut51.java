//multiple inheritance Not support in Java

class A{
    public A(){
        System.out.println("in A");
    }
}

class B{
    public B(){
        System.out.println("in B");
    }
}

class C extends A,B // Not work
{
    public C(){
        System.out.println("in C");
    }
}
