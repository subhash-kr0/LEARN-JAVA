// ArrayList in Java

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tut92 {
    public static void main(String[] args) {
        
        // Collection<Integer> nums = new ArrayList();
        List<Integer> nums = new ArrayList();
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

        for (Object n : nums) {
            int num = (Integer) n;
            System.out.println(n);
        }
        System.out.println(nums.get(3));
    }
}
