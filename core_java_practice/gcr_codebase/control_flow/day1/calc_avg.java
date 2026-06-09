import java.util.*;
public class calc_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int a=sc.nextInt();
        System.out.println("enter no2");
        int b=sc.nextInt();
        System.out.println("enter no3");
        int c=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.println("average of three nos"+avg);
        
    }
    
}
