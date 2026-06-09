package gcr_codebase.programming_elements.level1;
import java.util.Scanner;
public class convert_km_too_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    
}
}
