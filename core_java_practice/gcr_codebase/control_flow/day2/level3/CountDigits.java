package gcr_codebase.control_flow.day2.level3;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = Math.abs(n); // handles negative numbers

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}
