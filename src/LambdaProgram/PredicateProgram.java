package LambdaProgram;
import java.util.function.Predicate                                                                                                                                                 ;//importent



//predicate
//Predicate takes one input and returns a boolean.
//it is use for compare by test()

//Teke value -> return Boolean

public class PredicateProgram {
    public static void main(String args[]){
        Predicate<Integer> p1 = (a) -> a > 10; //only one input ->>
        System.out.println(p1.test(30));



        //other way even or not

        Predicate<Integer> p2 = (num) -> {  //direct write " retuern num%2==0;"
          if(num%2==0){
              return  true;
          }else{
              return false;
          }
        };
        System.out.println(p2.test(20));
        

    }



}
