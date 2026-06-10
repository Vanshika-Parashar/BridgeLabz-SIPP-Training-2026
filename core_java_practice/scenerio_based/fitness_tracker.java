package scenerio_based;
import java.util.*;
public class fitness_tracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter weight");
        float weight=sc.nextFloat();
        System.out.print("enter height");
        float height=sc.nextFloat();
        float bmi=weight/(height*height);
        if(bmi<18.5){
            System.out.print("you are unserweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.print("you are at normal weight");
        }
        else{
            System.out.print("you are overweight");
        }

    }
    
}
