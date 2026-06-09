package gcr_codebase.control_flow.day2.level3;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Step 2: Store original number
        int original = n;

        // Step 3: Count number of digits
        int count = 0;
        int temp = n;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 4: Find sum of digits raised to power count
        int sum = 0;
        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        // Step 5: Compare sum with original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
