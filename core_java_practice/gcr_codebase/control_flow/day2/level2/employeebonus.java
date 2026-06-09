package gcr_codebase.control_flow.day2.level2;

import java.util.*;

public class employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus;

        if (years > 10) {
            bonus = salary * 0.10;
        } 
        else if (years > 5) {
            bonus = salary * 0.05;
        } 
        else {
            bonus = salary * 0.02;
        }

        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + (salary + bonus));
    }
}