package gcr_codebase.control_flow.day2.level2;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
