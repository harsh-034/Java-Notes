/*
 * 📘 Recursion Notes
🔹 Definition

Recursion is a process in which a function calls itself directly or indirectly to solve a problem.

🔹 Key Terms

Recursive Case → The part where the function calls itself.

Base Case → The stopping condition (to prevent infinite recursion).

Stack → Each recursive call is stored in the function call stack, and removed (popped) when it returns.

returnType functionName(parameters){
    if(base condition){
        // stop recursion
        return;
    }
    // recursive case
    functionName(smaller problem);
}

 */

 //print number are n to 1??

package Recursion;

public class Recursion {
    public static void looping(int n){ //n =5
        //Base 
        if(n == 0) //Base class it is used of stop of repation 
            return; // return are use for stop / stop the function and go back immediately.
            //print 
              System.out.println(n); // print of all value 
              //recursion
        looping(n-1); // decrising in 1 number and go return stating point mins function 
      
    }
    public static void main(String args[]){
        int n = 5;
        looping(n);
        
    }
}
