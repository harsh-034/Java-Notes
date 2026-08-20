package LambdaProgram;
import java.util.function.Function;


//Function is a functional interface used to transform one value into another. Its main method is apply().
//if You can take input vale return another valu like you can say Change your value then return

// take input -> retun anoter value
public class FunctionProgram {
    public static void main(String args[]){
    Function<Integer,Integer> p1 = (X) -> X+2;
    System.out.println(p1.apply(3));

    }
    
}
