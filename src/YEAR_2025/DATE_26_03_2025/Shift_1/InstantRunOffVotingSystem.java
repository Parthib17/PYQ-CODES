package YEAR_2025.DATE_26_03_2025.Shift_1;

/* Online Java Compiler and Editor */
import java.util.*;
public class InstantRunOffVotingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();

        int r = 0;

        for(int i=0;i<a;i++){
            list.add(sc.nextLine());
        }

        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            map.put(str.charAt(0),map.getOrDefault(str.charAt(0),0)+1);

        }

        boolean isClear = false;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() > (a/2)){
                isClear = true;
                System.out.println("Winner "+entry.getKey());
            }
        }

        if(isClear==false){
            Set<Character> eliminated = new HashSet<>();
            while(true){
                r++;
                // Find the minimum votes among remaining candidates
                int minVotes=0;
                if(map.size()>0){
                    minVotes = Collections.min(map.values());
                }


                // Eliminate candidates with the least votes
                for(Map.Entry<Character,Integer> e : map.entrySet()){
                    if(e.getValue() == minVotes){
                        eliminated.add(e.getKey());
                    }
                }

                // Recount votes after elimination
                map.clear();
                for(String vote : list){
                        char c = vote.charAt(r);
                        if(!eliminated.contains(c)){
                            map.put(c, map.getOrDefault(c,0)+1);
                            break;
                        }
                }

                // Check if anyone now has >50% votes
                for(Map.Entry<Character,Integer> entry: map.entrySet()){
                    if(entry.getValue() > (a/2)){
                        System.out.println("Winner "+entry.getKey());
                        return;
                    }
                }

                // If only one candidate remains, declare them the winner
                if(map.size() == 1){
                    for(Character c : map.keySet()){
                        System.out.println("Winner "+c);
                        return;
                    }
                }
            }
        }
    }
}
