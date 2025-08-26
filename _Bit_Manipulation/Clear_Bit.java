package _Bit_Manipulation;

public class Clear_Bit {
    public static void main(String[] args) {
        //This Method is  used to clear the bit at a particuler potion (say i) of the given number N. 
        // Clear bit  are  used for  0 to 1 and 0 to 0 

        /*
    Qution :-clear the 3rd bit (position = 2 ) of Number n = 0101 
             Bit mask -> 1 << i
             Opration -> and(&) with Not(~)
             
        Step 1 -> 1 << i
                  0001 << 2
                   final value -> 0100 
        Steps 2 -> ~(0100) -> 1011 
                    final value -> 1011
        step 3  -> 1011 & 0101               1011
                    final value --> 0001(1)     0101
                                              ----
                                              0001                      
         */
       // clear the 3rd bit (position = 2 ) of Number n = 0101

       int n = 5;  // Number 
       int pos = 2; // potion of chanege
       //steps1
       int BitMask = 1 << pos ; // 1 << 2 , 0001 << 2 = 0100
       //steps 2
       int NotBitMask = ~(BitMask); //not use like ~(0100) = 1011
       // steps 3
       int Finalvalue = n & NotBitMask;// then i will use AND bit like 0101 & 1011 = 0001(1)
       System.out.println(Finalvalue);

    }
    
}
