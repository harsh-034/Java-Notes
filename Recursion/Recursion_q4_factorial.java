//print factorial of a number n

package Recursion;

// public class Recursion_q4_factorial {
//     public static void printfacter(int i, int n ,int  num ){
//         if(i==num+1){  // 5 = 6+1(7)
//             System.out.println(n);// print n
//             return;
//         }
//         n = n* i; // 2=1x2, 6=2x3, 24=6x4 , 120= 24x5
//         printfacter(i+1,n,num); // i =incriment, or n update store , or num compare 

//     }
    
//     public static void main(String args[]){
//         printfacter(2,1,5);// i =2 strting , n = 1 strting , num =stop number 
//     }
    
// }

/*
n=5!
Examples
1!=1
2!=2×1=2           n x i = n
3!=3×2×1=6         n x i+1 = n
4!=4×3×2×1=24
5!=5×4×3×2×1=120
 */


public class Recursion_q4_factorial {
    public static int printfacter(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int prcter_n = printfacter(n-1);
        int printnum = prcter_n*n;
        return printnum;
    }

    public static void main(String args[]){
        int ans = printfacter(5);
        System.out.println(ans);
    }
}

