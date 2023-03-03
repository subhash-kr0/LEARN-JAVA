import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//  Need of Stream API in Java 

public class Tut96 {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        nums.add(51);
        nums.add(36);
        nums.add(19);
        nums.add(20);
        nums.add(47);

        nums.stream().sorted().forEach(System.out::println);
        nums.stream().sorted((i, j) -> (i % 10 > j % 10) ? 1 : -1).forEach(System.out::println);
        nums.stream().sorted(Comparator.comparing(i -> i % 10)).forEach(System.out::println);

        List<Integer> nums1 = Arrays.asList(4,5,7,3,2,6);
        int sum=0;
        for(int n : nums1) {
            if(n%2==0){
            n = n*2;
            sum += n;
        }
      }
      System.out.println(sum);

      for(int i=0; i<nums1.size(); i++) {
          if(nums1.get(i)%2==0) {
              nums1.set(i, nums1.get(i)*2);
          }
      }

      for(int i=0; i<nums1.size(); i++) {
          System.out.println(nums1.get(i));
      }

      for(int n : nums1) {
          System.out.println(n);
      }

      nums1.forEach(n -> System.out.println(n));
    
    }
}