package YEAR_2024.DATE_03_05_2024.Shift_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine().trim().toUpperCase();
        String[] shoes = ip.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<shoes.length;i++){
            map.put(shoes[i],map.getOrDefault(shoes[i],0)+1);
        }
        int pairs=0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            String opp=null;
            if(entry.getKey().charAt(entry.getKey().length()-1) == 'L'){
                opp = entry.getKey().substring(0,entry.getKey().length()-1)+'R';
            }else if(entry.getKey().charAt(entry.getKey().length()-1) == 'R'){
                opp = entry.getKey().substring(0,entry.getKey().length()-1)+'L';

            }

            if(map.containsKey(opp)){
                pairs+=Math.min(entry.getValue(), map.get(opp));
            }
        }
        System.out.println((int)pairs/2);
    }
}
