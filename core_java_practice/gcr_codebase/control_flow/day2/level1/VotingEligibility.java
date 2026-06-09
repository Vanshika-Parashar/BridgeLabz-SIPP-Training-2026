import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Person can vote");
        } else {
            System.out.println("Person cannot vote");
        }
    }
}
