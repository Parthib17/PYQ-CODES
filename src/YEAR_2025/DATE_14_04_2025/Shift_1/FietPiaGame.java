package YEAR_2025.DATE_14_04_2025.Shift_1;

import java.util.Scanner;

public class FietPiaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] res = new String[t];
        int index=0;
        while(t!=0){
            int r = sc.nextInt();
            int[][] arr= new int[r][3];
            for (int i=0;i<r;i++){
                for (int j=0;j<3;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int size = r*3;
            if(size % 2==0){
                res[index] = "Pia";
            } else{
                res[index] = "Fiet";
            }
            index++;
            t--;
        }
        for(String s: res){
            System.out.println(s);
        }
    }
}
