package LambdaProgram;
import java.util.function.*;

// Consumer is used to perform an operation on an input without returning a result. Its main method is accept().
//You Take input but not return any value like void Retrun veriable

//take input -> not return anyy value (void)
public class ConsumerProgram {
    public static void main(String args[]){
        Consumer<String> p1 = (name) -> System.out.println(name);
        p1.accept("Harsh");

        Consumer<Integer> p2 = (num) -> System.out.println(num+2);
        p2.accept(3);
    }
}
