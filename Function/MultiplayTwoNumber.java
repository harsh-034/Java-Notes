
//Make Function to Multiplay 2 Number  and return the prodect 

import java.util.*;
public class MultiplayTwoNumber {

    public static int MultiplayNumber(int a, int b){
        int prodect = a*b;
        return prodect;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second number :");
        int b = sc.nextInt();
        int prodect = MultiplayNumber(a, b);
        System.out.println("Multiplay of two number : "+prodect);

    }
}


 
// Second Methed 

/* 
import java.util.*;
public class MultiplayTwoNumber {

    public static int MultiplayNumber(int a, int b){
       
        return a * b; //direct return value 

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two number :");
        int a = sc.nextInt();
        System.out.println("Enter the Scod number :");
        int b = sc.nextInt();
        
        System.out.println("Multiplay of two number : "+MultiplayNumber(a, b)); //direct function call 

    }
}
*/