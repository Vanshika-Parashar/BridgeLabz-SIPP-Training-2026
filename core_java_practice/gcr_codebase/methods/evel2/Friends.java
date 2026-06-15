package gcr_codebase.methods.evel2;

import java.util.Scanner;

public class Friends {

    public static int findYoungest(int[] ages) {

        int min = ages[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min)
                min = ages[i];
        }

        return min;
    }

    public static double findTallest(double[] heights) {

        double max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max)
                max = heights[i];
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest Age = " + findYoungest(ages));
        System.out.println("Tallest Height = " + findTallest(heights));
    }
}
