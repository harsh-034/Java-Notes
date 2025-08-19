//Qs :Take anarray as input from the user. Search for a given number X and print the index number at which it occurs.
//


// this is liner search

package Arrays;
import java.util.*;
public class Search_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size for array :");
        int size = sc.nextInt();

        int[] num = new int[size];

        for(int i=0; i<num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the search number: ");
        int Search = sc.nextInt();

        for(int i=0; i<num.length ; i++)
        {
            if(Search == num[i]){
               
                System.out.println(Search+" are index number  :"+i);
            }
        }
    }
}
