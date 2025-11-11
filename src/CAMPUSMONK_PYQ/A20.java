package CAMPUSMONK_PYQ;
import java.util.*;

public class A20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[3,4,5]";
        ip = ip.replaceAll("\\[|\\]|\\s","");
        String[] parts = ip.split(",");

        int[] arr = new int[parts.length];

        int i=arr.length-1;
        for(String x : parts){
            arr[i--] = Integer.parseInt(x);
        }
        System.out.println(Arrays.toString(arr));
    }
}
