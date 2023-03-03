// Class and Object Theory in Java

// class and object in java
// class is a blueprint of an object
// object is an instance of a class

// class is a user defined data type
// class is a collection of variables and methods

// class is a template
// object is a real world entity

// class is a logical entity
// object is a physical entity

// class is a abstract
// object is a concrete

// class is a static
// object is a dynamic

// class is a non physical
// object is a physical

// class is a non tangible
// object is a tangible

// class is a non living
// object is a living

// class is a non moving
// object is a moving

// class is a non real
// object is a real

class Student{
    public static String rollNo;
    // class variables
    String name;
    int age;
    int marks;

    public Student() {
    }
    
    // class methods
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Tut21 {
    public static void main(String[] args) {
        // create an object of class Student
        Student s1 = new Student();
        s1.name = "Harry";
        s1.age = 12;
        s1.marks = 90;
        s1.display();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        System.out.println(s1);

    }
    
}
