package CAMPUSMONK_PYQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataIp =  sc.nextLine();
        String charIp = sc.nextLine();

        dataIp = dataIp.replaceAll("\\[|\\]|\\s","");
        String[] arrData = dataIp.split(",");
        int[] arr=new int[arrData.length];
        for(int i=0;i< arrData.length;i++){
            arr[i] = Integer.parseInt(arrData[i]);
        }

        charIp = charIp.replaceAll("\\[|\\]|\\s","");
        String[] arrChar = charIp.split(",");
        char[] chr = new char[arrChar.length];
        for(int i=0;i< arrChar.length;i++){
            chr[i] = arrChar[i].charAt(0);
        }

        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],chr[i]);
        }

        Arrays.sort(arr);

        int i=0;
        for(int x : arr){
            System.out.print(map.get(x)+" ");
        }
    }
}
