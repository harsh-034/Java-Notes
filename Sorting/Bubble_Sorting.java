package Sorting;

public class Bubble_Sorting {
    public static void ShortArry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]); //
        }
        System.out.print(" ");
    }

    public static void main(String[] args){
        int arr[] = {2,4,1,5};//get array 
        for(int i= 0;i<arr.length-1;i++){     //outerside loop
            for(int j=0;j<arr.length-i-1; j++){ //inerside loop
                if(arr[j]>arr[j+1]){  //codtion ther first index is big of index 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
        ShortArry(arr);
    }


    
}
