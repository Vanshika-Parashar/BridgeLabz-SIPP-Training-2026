import java.util.*;
public class vol_cylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        int r=sc.nextInt();
        System.out.println("enter height");
        int h=sc.nextInt();
        double vol=2.14*(r^2)*h;
        System.out.println("volume is"+vol);
    }
}
