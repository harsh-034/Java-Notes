package Operator_And_Binary_number_System;

public class Binary_number_System{
    public static void main(String[] args){
    /*
    Binary are two number are use as will as use 0 and 1 

    0 = 000
    1 = 001
    2 = 010
    3 = 111
    4 = 100 
    5 = 101
    6 = 110
    7 = 111
    8 = 1000
    9 = 1001
    */    

// Bitwase opreter 
    
        // & (Binary AND) both are true then true 
         /*
         0 -> ther are false , 1 are true 
          0 1 0 1
         0 1 1 0
         --------
         0 1 0 0    Both true then true  
          */
        
        // | (Binary OR) ther use any tru then true 

         /*

         0 -> ther are false , 1 are true 

          0 1 0 1
          0 1 1 0
          --------
          0 1 1 1  any  true then true 
          */

       // ^ (Binary XOR) Difrent value are true like  1 0 = true  another wise same value are false  1 1 = false 

       /*
       1 0 -> true
       0 1 -> true
       1 1 -> false
       0 0 -> false

        /*
         0 -> ther are false , 1 are true 

         0 1 0 1
         0 1 1 0
         --------
         0 0 1 1    diffrent value then true  and same value then false  

          */

          // ~ (Binary one`s Complment ) ther are replace 

          /*
           A = 0 1 0 1
          ~A = 1 0 1 0
           */

        // << Binary left shift 
           //Ther are all value is left side shift 
           /*

           setex :  value opreter  Potion 
           
           Number << 1
            _ _ 1 0 1 1 _

            _ 1 0 1 1 _

            EX :

            0110 << 1 1potion left side shift 

            ans: 1100
            */

       // >> Binary number  shift right side 

     /*
      setex :  value opreter  Potion 
           
           Number >> 1
           
           0101 >> 1

           001
      */


// Assigment opreter 
    
     // "="  ther are assine right to  left 

           int B = 10;
           int A = B; 
           System.out.println("Asigment a to b use "+ A);

    // "+="
     
          int C = 10 , D = 5;
          C += D ; // C = C + D
          System.out.println("+= use : "+C);

    // "*="
     
          int e = 10 , f = 5;
          e *= f ; // e = e * f
          System.out.println("*= use : "+e);

    // "-="
     
          int g = 10 , h = 5;
          g -= h ; // g = g - h
          System.out.println("-= use : "+g);

    // "/="
     
          int i = 10 , j = 5;
          i /= j ; // i = i / j
          System.out.println("/= use : "+i);

    // "%="
     
          int k = 10 , l = 5;
          l %= k ; // k = k % l
          System.out.println("%= use : "+l);
    
    




        
       

    }      

       
}
