package Oops.program;
//find mex number
public class Mexnumber {
    int meximumNumber(int[] arr){
        int mex = arr[0];
        for(int i = 0;i < arr.length; i++ ){
            if(arr[i] > mex){
                mex =  arr[i];
            }
        }
        //System.out.print("this your mex value in the arr = "+mex);
        return mex;
    }
}
