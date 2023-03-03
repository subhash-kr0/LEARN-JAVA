//forEach Method in Java

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Tut97 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        nums.forEach(consumer);

        //In lambda expression
        nums.forEach(n -> System.out.println(n));
    }
    
}
