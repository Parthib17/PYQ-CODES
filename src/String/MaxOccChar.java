package String;
import java.util.*;

public class MaxOccChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks test aaa";
        s = s.replaceAll("\\s+","");
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = Integer.MIN_VALUE;
        char elem = '\0';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                elem = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println(elem+" - "+max);
    }
}
