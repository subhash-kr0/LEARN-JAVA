// Comparator vs Comparable in Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComp implements Comparator<Integer> {
    @Override
    public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10)
            return 1;
        else
            return -1;

    }
}

class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }
}
public class Tut95 {
        public static void main(String[] args) {
            Comparator<Integer> comp = new Comparator<Integer>() {
                @Override
                public int compare(Integer i, Integer j) {
                    if (i % 10 > j % 10)
                        return 1;
                    else
                        return -1;

                }
            };

            List<Integer> nums = new ArrayList<>();
            nums.add(51);
            nums.add(36);
            nums.add(19);
            nums.add(20);
            nums.add(47);

            Collections.sort(nums);
            Collections.sort(nums, comp);
            System.out.println(nums);

            Collections.sort(nums, new MyComp());
            System.out.println(nums);

            List<student> students = new ArrayList<>();
            students.add(new student("John", 30));
            students.add(new student("Jack", 40));
            students.add(new student("Jill", 50));
            students.add(new student("Johny", 60));

            Collections.sort(students, new Comparator<student>() {
                @Override
                public int compare(student s1, student s2) {
                    if (s1.age > s2.age)
                        return 1;
                    else
                        return -1;
                }
            });

            System.out.println(students);

            //in lambda expression
            Comparator<student> comp1 = (i, j) -> i.age > j.age? 1: -1;

        }
    }
    
