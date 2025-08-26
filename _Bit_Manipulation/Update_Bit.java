package _Bit_Manipulation;

import java.util.Scanner;

public class Update_Bit {
    public static void main(String[] args){
        //This Method is  used to update the bit at a particuler potion (say i) of the given number N.
        //ther are use of clear and set 
        //clear bit are use to convert 0
        //set bit are use to convert 1

        /*0 to 1 update 
         Update the 2nd bit (Position = 1 ) of number n to 1. n =(0101)
          -the are convert "0" to "1" then i will use set potion 
          imp
          Bit mask = 1 <<i
          Oprsition = OR

          Steps 1 :  1 << i
                     0001 << 1 
                     0010 final value 
                     
          steps 2 : 0010 | 0101
                    0111  potion index number are 0 are convert 1

    ----------------------------------------------------------------------------
     1 to 0 update

     Update the 2nd bit (Position = 2 ) of number n to 0. n =(0101)
          -the are convert "0" to "1" then i will use set potion 
          Bit mask = 1 <<i
          Oprsition = AND with NOT

          Steps 1 :  1 << i
                     0001 << 2 
                     0100 final value 
          step 2 : ~(0100) = 1011

          steps 3 :1011 & 1101  
                    1001  convert index 2 = 1 to 0 


          
          
         */
        // the 2nd bit (Position = 1 ) of number get user  n to 1. n =(0101)
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bit number get 0 and 1 :");
        // num : clear in 0 : set in 1 
        int num = sc.nextInt();

        int n = 5; //0101
        int pos = 1; //0001
        int BitMask = 1 << pos;// 1 << i = 0001 << 1 = 0010
        // Set for 1 update place in 0
        if(num == 1){ 
            int newNumber = BitMask | n;
            System.out.println(newNumber);
            //Clear for 0 place of 1
        }else{
            int NotBit = ~(BitMask);
            int newNumber = NotBit & n;
            System.out.println(newNumber);
        }
        
    }
}
