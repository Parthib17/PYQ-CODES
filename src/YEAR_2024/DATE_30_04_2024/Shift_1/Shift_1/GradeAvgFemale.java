package YEAR_2024.DATE_30_04_2024.Shift_1.Shift_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeAvgFemale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        List<String> ans = new ArrayList<>();
        int totalFemale = 0;
        int totalGrade = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            char grade = parts[2].charAt(0);
            String gender = parts[3];

            if (age > 20) {
                ans.add(name);
            }

            if (gender.equalsIgnoreCase("Female")) {
                totalFemale++;
                totalGrade += grade;
            }
        }

        // Print names of people with age > 20
        for (String name : ans) {
            System.out.println(name);
        }

        // Calculate average grade (ASCII value based)
        double avg = totalFemale == 0 ? 0 : (double) totalGrade / totalFemale;
        System.out.println(avg);
    }
}

