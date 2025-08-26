package _Bit_Manipulation;

public class Set_Bit {

    public static void main(String[] args) {
        
   
    // diff:- Thish method is used to set the bit at  a prticular position(say i) Given number of N.
    
    /*
     Q :-> Set the 2nd bit (position = 1) of a number n (n== 0101) (5).
     Bit Mask 1 << i(position=i)
     Operation :- OR
     --> 

    steps 1    Bit mask -  0001 << i
                           0010  << 1
                        final value -> 0010
    steps 2 opretion :- 0010 |(OR) 0101(5)
                        final value -> 0111   potion index 1 is 0 to convert(set) 1
      0111 = 7
     */

    // Q :-> Set the 2nd bit (position = 1) of a number n (n== 0101) (5).

    int n = 5 ; //number 0101
    int pos = 1; //potion i

    int BitMask = 1 << pos ; // 0010
    int numset = n | BitMask; // 0101 |(OR)  0010 = 0111
    System.out.println(numset); // 0111 = 7   change the potion 

    // OR Bit are use for convert 0 to 1
    // OR ther are work on any true then return are true 
 }

}
