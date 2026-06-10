package scenerio_based;
import java.util.*;

public class coffee_counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter coffee_type: ");
            String coffeeType = sc.next();
            if(coffeeType.equalsIgnoreCase("exit")){
                break;
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double bill=0.0;
            switch(coffeeType.toLowerCase()){
                case "espresso":
                    bill=100*quantity;
                    break;
                case "latte":
                    bill=200*quantity;
                    break;
                case "cappuccino":
                    bill=300*quantity;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }
            double gst=bill*0.18;
            double total=bill+gst;
            System.out.println("Bill Amount : " + bill);
            System.out.println("GST (18%)   : " + gst);
            System.out.println("Total Bill  : " + total);

            
        }
    }
    
}
