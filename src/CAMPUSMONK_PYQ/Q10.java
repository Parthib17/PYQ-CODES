package CAMPUSMONK_PYQ;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        int c0=0,c1=0,c2=0;

        for(int x:arr){
            if(x==0)
                c0++;
            if(x==1)
                c1++;
            if(x==2)
                c2++;
        }

        int j=0;
        for(int i=0;i<c0;i++){
            arr[j++] = 0;
        }
        for(int i=0;i<c1;i++){
            arr[j++] = 1;
        }
        for(int i=0;i<c2;i++){
            arr[j++]=2;
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(" ");
            }
        }
    }
}
