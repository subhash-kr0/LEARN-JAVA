// Creation of Array in Java 

public class Tut28 {
    public static void main(String[] args) {
        
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Another way of creating an array
        int[] marks2 = {10, 20, 30, 40, 50};
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);

        //Another way of creating an array
        int[] marks3 = new int[]{10, 20, 30, 40, 50};
        System.out.println(marks3[0]);
        System.out.println(marks3[1]);
        System.out.println(marks3[2]);
        System.out.println(marks3[3]);
        System.out.println(marks3[4]);

        // Print all the elements of an array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Print all the elements of an array using for-each loop
        for (int element : marks) {
            System.out.println(element);
        }

        // Print all the elements of an array using while loop
        int i = 0;
        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
        }

        // Print all the elements of an array using do-while loop
        int j = 0;
        do {
            System.out.println(marks[j]);
            j++;
        } while (j < marks.length);

        // Print all the elements of an array in reverse order
        for (int k = marks.length - 1; k >= 0; k--) {
            System.out.println(marks[k]);
        }

        // Print all the elements of an array in one line of code
        System.out.println(java.util.Arrays.toString(marks));

        // Vector in Java
        // Vector is a dynamic array
        // Vector is a resizable array
        // Vector is a synchronized array
        // Vector is a legacy class
        // Vector is a collection of similar data types
        // Vector is a collection of objects
        // Vector is a collection of heterogeneous data types
        // Vector is a collection of heterogeneous objects
        // Vector is a collection of dynamic objects
        // Vector is a collection of dynamic data types
        // Vector is a collection of dynamic heterogeneous data types
        // Vector is a collection of dynamic heterogeneous objects
        // Vector is a collection of dynamic heterogeneous data types and objects
        
        // Creation of Vector in Java
        java.util.Vector<Integer> v = new java.util.Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v);

        // Declaration of Vector in Java
        java.util.Vector<Integer> v2;
        v2 = new java.util.Vector<Integer>();
        v2.add(10);
        v2.add(20);
        v2.add(30);
        v2.add(40);
        v2.add(50);
        System.out.println(v2);

        // Another way of creating a Vector in Java
        java.util.Vector<Integer> v3 = new java.util.Vector<Integer>(10);
        v3.add(10);
        v3.add(20);
        v3.add(30);
        v3.add(40);
        v3.add(50);
        System.out.println(v3);

        // Print all the elements of a Vector in Java
        for (int i1 = 0; i1 < v.size(); i1++) {
            System.out.println(v.get(i1));
        }

        // Print all the elements of a Vector in Java using for-each loop
        for (int element : v) {
            System.out.println(element);
        }

        // Print all the elements of a Vector in Java in one line of code
        System.out.println(v);

        // Print all the elements of a Vector in Java in reverse order
        for (int j1 = v.size() - 1; j1 >= 0; j1--) {
            System.out.println(v.get(j1));
        }

        // Built-in methods of Vector in Java
        // add()
        // addAll()
        // addElement()
        // capacity()
        // clear()
        // clone()
        // contains()
        // containsAll()
        // copyInto()
        // elementAt()
        // elements()
        // ensureCapacity()
        // equals()
        // firstElement()
        // get()
        // hashCode()
        // indexOf()
        // insertElementAt()
        // isEmpty()
        // lastElement()
        // lastIndexOf()
        // remove()
        // removeAll()
        // removeElement()
        // removeElementAt()
        // removeRange()
        // retainAll()
        // set()
        // setElementAt()
        // setSize()
        // size()
        // subList()
        // toArray()
        // toString()
        // trimToSize()
        // Vector()
        // Vector(int)
        // Vector(int, int)
        // Vector(Collection)
        // Vector(Collection, int)
        // Vector(Collection, int, int)
        // Vector(int, int, int)
        // Vector(int, int, int, int)

        // Alternative of array and vector in Java
        // ArrayList
        // LinkedList
        // Stack
        // Queue
        // PriorityQueue
        // Deque
        // HashSet
        // LinkedHashSet
        // TreeSet
        // HashMap
        // LinkedHashMap
        // TreeMap
        // Hashtable
        // Properties
        // BitSet
        // Dictionary
        // WeakHashMap

        
    }
    
}
