package gcr_codebase.methods.evel2;

import java.util.Scanner;

public class RandomNumbers {

    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int num : arr) {

            sum += num;

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double) sum / arr.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int)result[1]);
        System.out.println("Maximum = " + (int)result[2]);
    }
}
