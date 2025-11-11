package CAMPUSMONK_PYQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static void merge(int[] nums1, int a, int[] nums2, int b, int[] arr){
        int left=0;
        int right=0;
        int i=0;
        while(left<a && right<b){
            if(nums1[left] <= nums2[right]){
                arr[i++]=nums1[left++];
            } else{
                arr[i++]=nums2[right++];
            }
        }
        while (left<a){
            arr[i++]=nums1[left++];
        }

        while (right<b){
            arr[i++]=nums2[right++];
        }

        int j=0;
        for(int x:arr){
            nums1[j++] = x;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] nums1 = new int[a+b];
        int[] nums2 = new int[b];

        int[] arr=new int[nums1.length];

        for(int i=0; i<a; i++){
            nums1[i] = sc.nextInt();
        }

        for(int i=0; i<b; i++){
            nums2[i] = sc.nextInt();
        }

        merge(nums1,a,nums2,b,arr);
        System.out.println(Arrays.toString(nums1));
    }
}
