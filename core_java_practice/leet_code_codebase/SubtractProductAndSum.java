package leet_code_codebase;

import java.util.Scanner;

public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        int x = n;
        int product = 1;
        int sum = 0;

        while (x != 0) {
            int digit = x % 10;
            product *= digit;
            sum += digit;
            x /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = subtractProductAndSum(n);

        System.out.println("Result: " + result);

        sc.close();
    }
}
