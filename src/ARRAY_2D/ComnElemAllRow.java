package ARRAY_2D;

import java.util.*;

public class ComnElemAllRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                max = Math.max(max,arr[i][j]);
            }
            list.add(max);
        }

//        for(int x : list){
//            System.out.println(x);
//        }

//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<n;j++){
                set.add(arr[i][j]);
            }
            for(int x : set){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == m){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
