package Sorting;

public class insertion_Sorting {
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
     int arr[] = {2,5,3,7,1};
     for(int i = 1; i<arr.length;i++){
        int conster = arr[i];
        int j = i-1;
        while (j>=0 && conster <arr[j]) {
             arr[j+1] = arr[j];
            j--;            
        }
        arr[j+1] = conster ;
     }
     printarr(arr);
    }
}
    
