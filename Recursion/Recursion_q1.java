//use recursion and print 1 to 5??
package Recursion;

public class Recursion_q1 {
    public static void printnum(int n){
        if(n==6)
        return;
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(){
        int n = 1;
        printnum(n);
    }
}

/* output :
 1
 2
 3
 4
 5

 */
