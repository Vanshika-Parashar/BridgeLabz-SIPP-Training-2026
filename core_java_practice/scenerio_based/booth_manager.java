package scenerio_based;

import java.util.Scanner;

public class booth_manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while (true) {
            System.out.print("Enter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote");

                System.out.print("Vote for Candidate (1, 2, or 3): ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1++;
                } else if (vote == 2) {
                    candidate2++;
                } else if (vote == 3) {
                    candidate3++;
                } else {
                    System.out.println("Invalid Vote");
                }
            } else {
                System.out.println("Not Eligible to Vote");
            }
        }

        System.out.println("\nVoting Result");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);
    }
}

