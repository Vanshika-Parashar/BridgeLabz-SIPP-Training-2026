package sorting;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
            
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("no. is prime");
        }else{
            System.out.println("no. is not prime");
        }
    }
}
