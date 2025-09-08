import java.util.*;
public class FunctionExample {

    public static void PrintMyName(S name){  // Syntex public static void Function_Name(Data_Type arg1,Data_Type arg1,.... ){opration}
        System.out.println(name);
        // "Void" useing  then not requrd of "return" keywords write 
        return;   // return ther are use for leve in loop 
        //and public static int Function_Name(){}  == return 1; ther use 
    }
/* */
    public static void main(S[] args){
        Scanner sc = new Scanner(System.in); // use for input 
        System.out.print("Enter Your Name :");
        String name = sc.nextLine();
        PrintMyName(name);// Call Function and ther are write same name of function 
    }
}
