package Arrays;
import java.util.*;

public class input_output_Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the size of Arrays : ");
        int size = sc.nextInt();//  get size from user

        int[] num = new int[size];  // arry sentex

        //input
        System.out.println("Enter the  value for input  ");
        for(int i=0; i<size;i++)
        {
            num[i] = sc.nextInt(); // take input from user it only take number of input depand on size
        }
        
        System.out.println("Read your Output :");
        //output
        for(int i=0; i<num.length;i++)
        {

            System.out.println(num[i]); // git output 
        } 
    }
}

/* // array get size but not get value(intional) the output is  (0)null value 


  int[] num = new int[3];
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        } 

output 


*/        