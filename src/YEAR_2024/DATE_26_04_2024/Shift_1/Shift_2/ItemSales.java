package YEAR_2024.DATE_26_04_2024.Shift_1.Shift_2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n = sc.nextInt();

        HashMap<String, Double> map = new HashMap<>();
        double totalSales = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item = sc.next();

            System.out.print("Enter price per unit: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            double revenue = price * quantity;
            totalSales += revenue;

            map.put(item, map.getOrDefault(item, 0.0) + revenue);
        }

        double avg = totalSales / n;

        String bestSelling = null;
        double max = 0.0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                bestSelling = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.printf("Total Sales: $%.2f\n", totalSales);
        System.out.printf("Avg Sales: $%.2f\n", avg);
        System.out.printf("Best Selling: %s\n", bestSelling);

    }
}
