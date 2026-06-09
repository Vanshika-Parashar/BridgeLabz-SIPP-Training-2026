import java.util.*;
public class perimeter_rec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter width");
        int w=sc.nextInt();
        int p=2*(l+w);
        System.out.println("perimeter is"+p);
    }
    
}
