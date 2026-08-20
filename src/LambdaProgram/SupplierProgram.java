package LambdaProgram;
import java.util.function.*;


//Suplier is not take input return value 

//Not Input -> return value
public class SupplierProgram{
    public static void main(String args[]){
        Supplier<String> str = () -> "My name is harsh";
        System.out.println(str.get());

    }
} 