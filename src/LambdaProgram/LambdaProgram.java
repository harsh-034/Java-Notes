package LambdaProgram;
import java.util.function.Predicate;
/**
 * InnerLambdaProgram
 */

    /*
    
    className lambadaName = (paramitrize frm class) -> {
    
    right any one this block
    
    };
    
    */


public class LambdaProgram {
    public static void main(String args[]){
        Sum obj2 = (int a,int b) -> {
            System.out.println(a+b);
            return a+b;
        };
        obj2.Add(3,4);


    }
    }

