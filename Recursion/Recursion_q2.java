package Recursion;

public class Recursion_q2 {
   public static void printnum(int i, int n, int sum){
    if(i==n){//exicute in i == 11
        System.out.print(sum); // then = sum are print 
        return ;//base 
    }
    sum = sum +i; // sum =+ i+1
    printnum(i+1, n, sum); // i = i+1, n same, sum are sam 
   }
    public static void main(String args[]){
       
       printnum(1,11,0);// i starting  in 1, ending in 11;sum start o
       
    }
}


// int sum = 0;
//        for(int i= 0;i<=10;i++ )
//        {
//         sum = sum + i;
//        }