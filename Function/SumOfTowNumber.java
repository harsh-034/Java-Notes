// Sum Of Two number using Function


import java.util.*;

public class SumOfTowNumber {
    public static int SumPrint(int a, int b){
        int sum = a + b ;

        System.out.print("Total number of sum : "+sum);
        return 1;  // public staitic are use of "int" then i am using " return 1;"
    }



    public static void main(S[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Scound Number :");
        int b = sc.nextInt();
        SumPrint(a,b);

    }
}


//Second Method 

/* 
import java.util.*;

public class SumOfTowNumber {
    public static int SumPrint(int a, int b){
        int sum = a + b ;
        return sum;  // retrn kar denge niche
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Scound Number :");
        int b = sc.nextInt();
        int sum = SumPrint(a,b); //ther are function call and after store sum virable and go to print 
        // sum ther are get return value " return sum"
         System.out.print("Total number of sum : "+sum);

    }
}

*/

