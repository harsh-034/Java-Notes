package Sorting;

public class Selection_Sorting {

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]); //print finall output

        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {6,5,1,3};//create arr 
        for(int i=0; i<arr.length-1;i++){    // ther are use for arr legthe lest element ignore 
            int smallest = i;// 0123 
            for(int j=i+1; j<arr.length;j++){ // j are start from i+1 mince index 1234 
                if(arr[smallest]>arr[j]){   // condition 0 index > 1 index to 
                    smallest = j; // ther are store in smallest 1 are store in 0 index 
               
                }
            }
            int temp = arr[smallest];// arr[smalles] are store in tem ver //exmape 6 store in temp
            arr[smallest] = arr[i];// arr[smallest] are null becouse ther are before store in tem virable //arr[i] 6 store in arr[smallest];
            arr[i] = temp;//a[i] are empty then temp virable are swep in a[i] hai 
        
        }
        printarr(arr);//call
    }
}
//time complexcity = O(n^2)


//  public static void arrprint(int arr[]){
//         for(int i= 0; i<arr.length; i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
// public static void main(String[] args){
//     int arr[] = {1,3,2,6,7};
//     for(int i = 0;i<arr.length-1; i++ ){
//         int smaller = i;//one element 
//         for(int j = i+1; j<arr.length;j++){
//             if(arr[smaller]>arr[j]){
//                 smaller = j; //ther are store in two 
//             }
           
//             }
//              int temp = arr[smaller];//temp =2
//             arr[smaller] = arr[i];  //smaller = 3
//             arr[i] = temp;//i=2
//         }
//         arrprint(arr);//i=2
//     }
 