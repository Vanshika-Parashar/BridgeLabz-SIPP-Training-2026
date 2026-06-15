package gcr_codebase.methods.evel2;

import java.util.Scanner;

public class compare {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (isPositive(arr[i])) {

                if (isEven(arr[i]))
                    System.out.println(arr[i] + " is Positive and Even");
                else
                    System.out.println(arr[i] + " is Positive and Odd");

            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First element is Greater");
        else if (result == 0)
            System.out.println("Both elements are Equal");
        else
            System.out.println("First element is Smaller");
    }
}
