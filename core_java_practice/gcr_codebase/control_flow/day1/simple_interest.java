import java.util.*;
public class simple_interest {
     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter principle");
        int p=sc.nextInt();
        System.out.println("enter rate");
        int r=sc.nextInt();
        System.out.println("enter time");
        int t=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("simple interest is" + si);
    }
}
