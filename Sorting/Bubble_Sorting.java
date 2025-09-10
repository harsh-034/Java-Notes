/*
 diff - it is use for simple sorting algorthm thet repdetly sweps adjest element if they are the wrong order.
 ->Campare & swep adjacemt element 
 ->Time complexcity "O(n^2)"
 ->it is but slow 
 */


package Sorting;
import java.util.*;

public class Bubble_Sorting {
    /*public static void ShortArry(int arr[]){ //make class ther use for print of array
        for(int i=0;i<arr.length;i++){// loop for print 
            System.out.print(arr[i]); // a[i] = index number of value like 1=2
        }
        System.out.print("");
    }

    public static void main(String[] args){
        int arr[] = {2,4,1,5};//get array 
        for(int i= 0;i<arr.length-1;i++){     //outerside loop       //arr.length-1 "-1" ther are use becouse ending point already shorted rahata hai 
            for(int j=0;j<arr.length-i-1; j++){ //inerside loop   //arr,length-i-1 "i" ther are use for end me already short arr ko use na kare 
                if(arr[j]>arr[j+1]){  //codtion ther are first index is big in second potion  
                    int temp = arr[j];// it is a[j] store in temp virable
                    arr[j] = arr[j+1];// after store a[j] are null then i will use for storing data from a[j+1]
                    arr[j+1] = temp;//same arr[i+j] are numll then store place of storng dta for temp jo upper stpre liya hu
                }
            }
        } 
        ShortArry(arr);//it is use for call
    }
*/

// Bubble Short
public static void arrprint(int arr[],int n){
    for(int i=0; i<n;i++){
        System.out.print(arr[i]);
    }
    System.out.println();
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of arr :");
    int size = sc.nextInt(); 
    int[] arr = new int[size];
    System.out.println("whose number are sorted :");
    for(int i=0; i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    int n = arr.length;
    for(int  i = 0; i<n-1;i++){ // n-1
        for(int j=0;j<n-i-1;j++){//n-1
            if(arr[j]>arr[j+1]){
                int tmep = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= tmep;
            }
        }
        
    }
    arrprint(arr,n);
}  
}
//time comlexecity = O(n^2)
