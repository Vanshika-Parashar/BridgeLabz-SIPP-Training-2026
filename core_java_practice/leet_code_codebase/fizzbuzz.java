package leet_code_codebase;

import java.util.*;

public class fizzbuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(find(i));
        }

        return ans;
    }

    public static String find(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } 
        else if (i % 3 == 0) {
            return "Fizz";
        } 
        else if (i % 5 == 0) {
            return "Buzz";
        } 
        else {
            return String.valueOf(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        List<String> result = fizzBuzz(n);

        System.out.println(result);

        sc.close();
    }
}
