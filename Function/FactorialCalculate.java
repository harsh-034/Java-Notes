//Find the Factorial of number with function
// fectorial 5 = 5 x 4 x 3 x 2 x 1 = 120
//  n! = n x (n-1) x (n-1)...x1
//   o! = 1


import java.util.*;
public class FactorialCalculate {
    public static void  Factorialcaul(int n){

      if(n< 0){
        System.out.println("Invalid number ");
        return ;  // thare any place use "return" then i will go to outoff block
        }
        
        int factorial = 1;
        for(int i = n ; i>=1; i--){
            factorial = factorial * i;
            
        }
        System.out.println("factorial number is :"+factorial);
       //Ther are not requement  of retrun becouse use of "void" function 
    }



    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        Factorialcaul(n);
       
    }
    
}



//Scond methode 
/*
import java.util.*;
public class FactorialCalculate {
    public static int  Factorialcaul(int n){
      

        int factorial = 1;
        for(int i = n ; i>=1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int factorial = Factorialcaul(n);
        System.out.println("factorial number is :"+factorial);
    }
    
}



*/
