package YEAR_2024.DATE_09_05_2024.Shift_1;

import java.util.Scanner;

public class ArmstrongNum {
    public static boolean isArmstrong(int num,int n){
        int s=0;
        int temp=num;
        while(num>0){
            int ld = num % 10;
            s+= Math.pow(ld,n);
            num = num/10;
        }

        if(s == temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts  = sc.nextLine().split(",");
        int[] arr = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        for(int i=0;i<arr.length;i++){
            int n = String.valueOf(arr[i]).length();
            if(isArmstrong(arr[i],n)){
                System.out.print(arr[i]);

                if(i<arr.length-1){
                    System.out.print(" ");
                }
            }
        }

    }
}
