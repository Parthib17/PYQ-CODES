package YEAR_2025.DATE_26_03_2025.Shift_2;
import java.util.*;
public class LeftOverElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        int u =sc.nextInt();
        int n =sc.nextInt();

        HashSet<Integer> set =  new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i=l;i<=u;i++){
            if(!set.contains(i)){
                temp.add(i);
            } else{
                if(!temp.isEmpty()){
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }

            }
        }

        if(!temp.isEmpty()){
            res.add(new ArrayList<>(temp));
        }

        for(List<Integer> g : res){
            System.out.print("["+g.get(0)+", "+g.get(g.size()-1)+"] ");
        }

    }
}
