package CAMPUSMONK_PYQ;
import java.util.*;

public class A23{
    public static int search(int[] arr,int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();

        System.out.println(search(arr,t));
    }
}