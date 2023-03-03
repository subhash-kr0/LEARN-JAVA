// Map in Java

import java.util.HashMap;
import java.util.Map;

public class Tut94 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("John", 30);
        map1.put("Jack", 40);
        map1.put("Jill", 50);
        map1.put("Johny", 60);

        System.out.println(map1.get("John"));
        System.out.println(map1.get("Jack"));
        System.out.println(map1.get("Jill"));
        System.out.println(map1.get("Johny"));
        System.out.println(map1);

        for (String key : map1.keySet()) {
            System.out.println(key + " : " + map1.get(key));
        }


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "John");
        map.put("age", "30");
        map.put("job", "programmer");
        map.put("name2", "Jack");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("job"));
        System.out.println(map.get("name2"));
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
    
}
