package leet_code_codebase;

import java.util.Scanner;

public class number_of_steps_to_zero{

    public static int numberOfSteps(int num) {
        return find(num, 0);
    }

    public static int find(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 2 == 0) {
            return find(n / 2, count + 1);
        } else {
            return find(n - 1, count + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = numberOfSteps(num);

        System.out.println(result);

        sc.close();
    }
}
