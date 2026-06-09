package gcr_codebase.control_flow.day2.level3;

import java.util.*;

public class abundantnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Find sum of proper factors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum > n) {
            System.out.println(n + " is an Abundant Number");
        } else {
            System.out.println(n + " is not an Abundant Number");
        }
    }
}
