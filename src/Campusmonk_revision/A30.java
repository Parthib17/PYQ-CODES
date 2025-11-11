package Campusmonk_revision;
import java.util.*;

public class A30{

    public static int removeDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        return set.size();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];

        int p=0;
        for(String x : parts){
            arr[p++] = Integer.parseInt(x);
        }

        System.out.println(removeDup(arr));

    }
}
