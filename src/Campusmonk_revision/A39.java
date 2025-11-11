package Campusmonk_revision;
import java.util.*;

public class A39 {
    public static int[] twoSum(int[] arr,int k){
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                res[0] = map.get(k-arr[i]);
                res[1] = i;
                return res;
            } else{
                map.put(arr[i],i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int k = sc.nextInt();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int p=0;
        for(String x : parts){
            arr[p++] = Integer.parseInt(x);
        }
        System.out.println(Arrays.toString(twoSum(arr,k)));
    }
}
