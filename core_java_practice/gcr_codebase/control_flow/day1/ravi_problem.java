import java.util.*;
// Ravi just joined a coding guild. Store his name, age, rank, salary, and
// membership fee (float) using correct data types. Compute his
// annual bonus (12% of salary), cast it to int, and print a formatted
// welcome card.

public class ravi_problem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name:");
        String s=sc.nextLine();
        System.out.print("enter age:");
        int age=sc.nextInt();
        System.out.print("enter rank:");
        int rank=sc.nextInt();
        System.out.print("enter salary:");
        double salary=sc.nextDouble();
        System.out.print("enter membership fee:");
        float fee=sc.nextFloat();
        double bonus=(int)(salary*0.12);
        System.out.println("hi" + s);
        System.out.println(s+"'s age is:"+age);
        System.out.println(s+"'s rank is:"+rank);
        System.out.println(s+"'s salary is:"+salary);
        System.out.println(s+"'s membership fee is:"+fee);
        System.out.println(s+"'s annual bonus is:"+bonus);

    }
    
}
