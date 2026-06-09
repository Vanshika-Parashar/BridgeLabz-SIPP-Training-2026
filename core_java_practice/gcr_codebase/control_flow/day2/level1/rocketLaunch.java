import java.util.*;

public class rocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        System.out.println("Rocket Launched!");
    }
}
