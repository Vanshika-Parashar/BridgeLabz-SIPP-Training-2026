package gcr_codebase.methods.evel2;

import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {

        if (age < 0)
            return false;

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();

            if (obj.canStudentVote(age[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}
