//Map Filter Reduce sorted

// package Basic Syntex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tut99 {
    public static void main(String a[]) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer t) {
        //         if (t % 2 == 0) {
        //             return true;
        //         }
        //         else
        //             return false;
        //     }

         Predicate<Integer> p = n -> n%2; 
            
        };

        int result = nums.stream()
                .filter(p)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}
