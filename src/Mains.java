import java.util.HashMap;
import java.util.Map;

public class Mains {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();

        // put() - associates the specified value with the specified key in this map
        // A map cannot contain duplicate keys; each key can map to at most one value.
        map1.put('c', 1);
        map1.put('a',5);
        map1.put('b',2);
        map1.put('g',8);
        map1.put('z',10);
        map1.put('a',9); // will associate 9 with 'a' instead of 5

        for(char key : map1.keySet()){
            int value = map1.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println();

        // containsKey() - returns true if the map contains the given key
        System.out.println(map1.containsKey('d')); // false
        System.out.println(map1.containsKey('z')); // true

        System.out.println();
        // get() - returns the value to which the specified key is mapped, or null if
        // this map contains no mapping for the key.
        System.out.println(map1.get('d')); // null
        System.out.println(map1.get('z')); // 10

        System.out.println();

        // containsValue() - returns true if this map maps one or more keys to the
        // specified value.
        System.out.println(map1.containsValue(0)); // false
        System.out.println(map1.containsValue(10)); // true

        System.out.println();

        // entrySet() - Returns a Set view of the mappings contained in this map.
        System.out.println(map1.entrySet()); // [g=8, b=2, c=1, a=9, z=10]

        System.out.println();

        // keySet() - Returns a Set view of the keys contained in this map.
        System.out.println(map1.keySet()); // [g, b, c, a, z]
    }
}
