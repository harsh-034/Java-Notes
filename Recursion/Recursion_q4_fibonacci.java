package Recursion;

public class Recursion_q4_fibonacci {
    public static void clculateFibsirese(int a, int b, int n){
        if(n==0){ // Base  // there for dicrise is 1 by 1 
            return; // return
        }
        int c = a + b; // a+b = c
        System.out.println(c); // addition print 
        clculateFibsirese(b, c, n-1); // then replace a -> b and b -> c  then term are 1 by 1 dicrise 
    }
    
public static void main(String args[]){
   int a = 0;
   int b = 1;
   System.out.println(a); // 1 term 
   System.out.println(b); // 2 term
   int n = 7; //find 7 term but already 2 terme are dinoted 
   clculateFibsirese(a, b, n-2);  // therfore n-2 becouse already print 2 term 

}
}  

/*
vALUE ->    term
0 -> 1
1 -> 2
1 -> 3
2 -> 4
3 -> 5
5 -> 6
8 -> 7
 */

