package leet_code_codebase;

import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int x) {
        long res = 0;

        while (x != 0) {
            int digit = x % 10;
            res = res * 10 + digit;
            x /= 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        int result = reverse(x);

        System.out.println("Reversed integer: " + result);

        sc.close();
    }
}
