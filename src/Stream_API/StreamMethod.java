package Stream_API;
import java.util.List;
import java.util.Arrays;

public class StreamMethod {
    public static void main(String args[]){
        //process of Stream()
        // sorce            -> intermidate                                           ->                                        Terminal
        // obj_name.stream()   Filter,Map,Peek,sorted,limit,densitic,skeep,fletmap

        List<Integer> p = Arrays.asList(6666,3,2,2,1,5,5,4,4,3,7,7,6,3,23,22,11,55,66,77);
        //shors(Stsrting point )
        p.stream()
        //intermidate(process)
         .filter(x->x%2==0)  //6666,2,2,4,4,6,22,66 //it is using for condition 
         .map(x->x*2)//13332,4,4,8,8,12,44,132      // it is using for value to convert anoter value like function interface 
         .peek(System.out::println)//print //13332,4,4,8,8,12,44,132  // you can cheke or print any time for using debagging 
         .sorted()//4,4,8,8,12,44,132,13332//it is using for sort
         .distinct() //4,8,12,44,132,13332 //it is using for remove duplicate value 
         .limit(5)//4,8,12,44,132  // set limit count meximumm at number present 
         .skip(2)//12,44,132 // skeep 1to skeep(5) then continue 
         //terminal(Ending)
         .forEach(System.out::println);  // it is using for print 




         System.out.println("Using ArrayList");
         //using 
         List<List<Integer>> p2 = Arrays.asList(List.of(3,2,4,5),List.of(33,22,11,666,77));

         p2.stream()
           .flatMap(x->x.stream())//ther are using 2 list conver one form 
           .filter(x->x>0)
           .sorted()
           .forEach(System.out::println);
    
    }
}
