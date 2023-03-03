// Array of Objects in java

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}


public class Tut32 {
    public static void main(String[] args) {
        // Array of Objects
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Harry");
        arr[1] = new Student(2, "Rohan");
        arr[2] = new Student(3, "SkillF");
        arr[3] = new Student(4, "Shubham");
        arr[4] = new Student(5, "Shivam");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollNo + " " + arr[i].name);
        }

        // Another way of creating an array of objects
        Student[] arr2 = {new Student(1, "Harry"), new Student(2, "Rohan"), new Student(3, "SkillF"), new Student(4, "Shubham"), new Student(5, "Shivam")};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].rollNo + " " + arr2[i].name);
        }

        // Enhanced for loop
        for (Student s : arr2) {
            System.out.println(s.rollNo + " " + s.name);
        }

        // Another way of creating an array of objects
        Student obj1 = new Student(1, "Harry");
        Student obj2 = new Student(2, "Rohan");
        Student obj3 = new Student(3, "SkillF");
        Student obj4 = new Student(4, "Shubham");
        Student obj5 = new Student(5, "Shivam");    
        Student[] arr3 = {obj1, obj2, obj3, obj4, obj5};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i].rollNo + " " + arr3[i].name);
        }
    }
    
}
