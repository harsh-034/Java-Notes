package _Bit_Manipulation;

public class Bit_maniplication {
    public static void main(String[] args){
        //Bit Manipulation is a technique used in a variety of problems to get the solution in an optimized way.

        // Bit Manipulation are 4 type
        /*
         1) Get Bit 
         2) Set Bit
         3) Clear Bit
         4) Update Bit 

         */
        /*
         Get the 3rd bit (position = 2) of a number  n (n= 0101)

         -bit mask : 1<<i
         opration : AND

         solotion : step 1 : 0001 << 2(potion)
                          final answer :- 0100
                    step 2 : 0100 &(AND) 0101   // both are equal true another vaice false 
                              (mask)     (orginal vales)   0100
                                                           0101 
                                                           ----
                                                           0100   final answer
             Code :=                                              
         */
// Get the 3rd bit (position = 2) of a number  n (n= 0101)


         int n = 5;
         int pos = 2;

         int BitMask = 1 << pos;

         if((n & BitMask)==0)
         {
          System.out.println("Bit was Zero");  
         } else {
            System.out.println("Bit was One");
         }





        
    }
}
