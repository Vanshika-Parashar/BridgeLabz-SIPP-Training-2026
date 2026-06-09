import java.util.*; 
public class pow_calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int n=sc.nextInt();
        System.out.println("enter exponent");
        int e=sc.nextInt();
        double pow=Math.pow(n,e);
        System.out.println("power is "+pow);

    }

    
}
