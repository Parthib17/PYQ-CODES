package YEAR_2024.DATE_29_04_2024.Shift_2;

import java.util.HashSet;

public class BitwiseOrSubArray {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> prev = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        // Initialize with first element
        prev.add(arr[0]);
        res.add(arr[0]);

        // Process remaining elements
        for (int i = 1; i < arr.length; i++) {
            HashSet<Integer> curr = new HashSet<>();

            // Extend all previous subarrays
            for (int x : prev) {
                int val = arr[i] | x;
                curr.add(val);
                res.add(val);
            }

            // Start a new subarray with arr[i]
            curr.add(arr[i]);
            res.add(arr[i]);

            // Update prev for next iteration
            prev = curr;
        }

        return res.size();
    }

    public static void main(String[] args) {
        BitwiseOrSubArray sol = new BitwiseOrSubArray();

        System.out.println(sol.subarrayBitwiseORs(new int[]{0}));        // 1
        System.out.println(sol.subarrayBitwiseORs(new int[]{1, 1, 2}));  // 3
        System.out.println(sol.subarrayBitwiseORs(new int[]{1, 2, 4}));  // 6
    }
}
