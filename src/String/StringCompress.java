package String;

import java.util.*;

public class StringCompress {

    public int compress(char[] chars) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Build compressed string
        String res = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            res += entry.getKey() + "" + entry.getValue();
        }

        char[] arr = res.toCharArray();
        return arr.length;
    }

    public static void main(String[] args) {
        StringCompress obj = new StringCompress();

        // Example input
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int result = obj.compress(chars);

        System.out.println("Compressed Length: " + result);
    }
}
