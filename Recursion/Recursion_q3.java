package Recursion;

public class Recursion_q3 {
    public static void printmul(int i, int n, int mul, int num ){
        if(i==n){//i=n // 11 == 11
            return; // return after exicute 
        }
        num = mul * i; // 1 =1 ,3 = 3 X 1
        System.out.println(mul +" X " +i +"=" +num); // continuue print 
        printmul(i+1,n,mul,num); //return call of function and i= are incriment by 1 and then mul, n, num are same 
    }
    public static void main(String args[]){
    printmul(1,11,3,0);//i= starting point, n = stopint pont, mul = whose multiplay, num= ther are use for store 
    }
}
