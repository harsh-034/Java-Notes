package Stream_API;
import java.util.List;

import java.util.Arrays;
import java.util.ArrayList;

//Important Point
//Stream does not store data. It processes data from a source.

//Stream api is java 8 Feature use to process and transfrom data from collectin in declretive /function style.
public class StreamApiProgram {
    public static  void main(String args[]){
    List<Integer> arr = Arrays.asList(11,1,3,2,43,2,2,1,1);
    arr.stream()
       .filter(x->x>2)// 11,3,43  Used to select elements based on a condition. call Filter() funcgtion (selects data)
       .map(x->x*5) //11*5,3*5,43*5 Used to transform each element.  (transfer )
       .forEach(System.out::println);   //Method refrance 
    

       System.out.println("another method ");
    List<Integer> a = Arrays.asList(5,3,2,254,1,1,4,6);
    a.stream()
       .filter(x->x>3)
       .map(x-> x*5)
       .sorted()
       .forEach(System.out::println);


       ArrayList<Integer> result = new ArrayList<>(List.of(2323,1,3,12,77,7,9,0,5,463,523,33344,55));
       
       System.out.println("Array list :"+result);

       result.stream()
             .filter(x->x>0)
             .filter(x->x%2==0)
             .map(x->x*2)
             .sorted()
             .forEach(System.out::println);

             

       
    }
 
}
