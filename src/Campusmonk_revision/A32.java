package Campusmonk_revision;

import java.util.ArrayList;
import java.util.Scanner;

public class A32 {

    public static void mergeArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            } else{
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j<m){
            if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
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

        String ip1 = sc.nextLine();
        ip1 = ip1.replaceAll("\\[|\\]|\\s+","");
        String[] parts1 = ip1.split(",");
        int[] arr1 = new int[parts1.length];

        int p1=0;
        for(String x : parts1){
            arr1[p1++] = Integer.parseInt(x);
        }

        mergeArray(arr,arr1);
        //System.out.println(missingNum(arr));

    }
}
