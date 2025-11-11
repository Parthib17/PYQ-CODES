package CAMPUSMONK_PYQ;
import java.util.*;

public class Q3 {
    public static String oddBallonColor(char[] ballon){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c: ballon){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                return entry.getKey().toString();
            }
        }
        return "All are even.";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s","");
        String[] parts = ip.split(",");
        char[] chr = new char[parts.length];
        for(int i=0;i<parts.length;i++){
            chr[i] = parts[i].charAt(0);
        }

        System.out.println(oddBallonColor(chr));
    }
}
