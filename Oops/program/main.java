package Oops.program;

public class main {
    public static void main(String[] args){
        int [] arr = {3,22,44,11};
        Mexnumber m = new Mexnumber();
        MinNumber n = new MinNumber();
        //-------------------------------------------------------
        //find meximumm number use return
         int result = m.meximumNumber(arr);
         System.out.println("this is your mex value : "+ result);
         //---------------------------------------------------
        //find minumm number of arr
        int result1 = n.minimumNumber(arr);
        System.out.println("this is your minimum Value : "+result1);

    }
}
