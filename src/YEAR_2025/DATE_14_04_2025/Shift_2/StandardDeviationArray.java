package YEAR_2025.DATE_14_04_2025.Shift_2;

import java.util.*;
public class StandardDeviationArray {

    public static double calculateSD(int[] arr){
        if(arr.length==0){
            return 0.0;
        }

        int s=0;
        for(int i:arr){
            s+=i;
        }
        double n = arr.length;
        double mean = s/n;

        double sum = 0;
        for (int i=0;i< arr.length;i++){
            double temp=Math.pow((arr[i]-mean),2);
            sum+=temp;
        }
        sum=sum/n;
        double sd = Math.sqrt(sum);

        return sd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.printf("%.2f",calculateSD(arr));
    }
}
