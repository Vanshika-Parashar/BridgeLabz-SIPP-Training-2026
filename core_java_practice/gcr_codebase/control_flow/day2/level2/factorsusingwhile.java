package gcr_codebase.control_flow.day2.level2;

import java.util.*;

public class factorsusingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("Factors of " + n + " are:");

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}