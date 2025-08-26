package _Bit_Manipulation;

public class Get_Bit {
    public static void main(String[] args){
        //diffin := This method is used to find the bit at a particular position(say i) of the given number N.

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

         int n = 7;
         int pos = 2;

         int BitMask = 1 << pos;

         if((n & BitMask)==0)
         {
          System.out.println("Bit was Zero");  
         } else {
            System.out.println("Bit was One");
         }


          // Get the 3rd bit (position = 2) of a number  n (n= 1000)(8)    2 potion kya hoga  answerr 2 potion are 0
         // 1000 = 8

         int n1 = 8;
         int pos1 = 3;  // index 3 = 1; retrin 1

         int BitMask1 = 1 << pos1;   // 0001(all are same ) << 3(potion)  == 1000

         if((n1 & BitMask1)==0){  //1000 &(And) 1000(8)(orginal number )
            System.out.println("Bit was Zero");
         }else {
            System.out.println("Bit was one ");
         }
    }
}
