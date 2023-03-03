// Set in Java

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tut93 {
    public static void main(String[] args) {
            
            // Set<Integer> nums = new HashSet<Integer>();

            // Set<Integer> nums = new TreeSet<Integer>();
            Collection<Integer> nums = new TreeSet<Integer>();

            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            
            // for (int n : nums) {
            //     System.out.println(n);
            // }
            // System.out.println(nums);

            Iterator<Integer> it = nums.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

    }    
}
