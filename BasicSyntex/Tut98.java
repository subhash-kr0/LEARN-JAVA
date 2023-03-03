//Stream API in Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Tut98 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> stream = nums.stream();
        // stream.forEach(n -> System.out.println(n));
        // stream.forEach(n -> System.out.println(n)); //Stream works only once
    

        Stream<Integer> stream1 = stream.filter(n -> n % 2 == 0);
        // stream1.forEach(n -> System.out.println(n));

        Stream<Integer> stream2 = stream1.map(n -> n * 2);
        // stream2.forEach(n -> System.out.println(n));

        int sum = stream2.reduce(0, (a, b) -> a + b);
        System.out.println(sum);

       int result = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (a, b) -> a + b);
        System.out.println(result);

    }

}
