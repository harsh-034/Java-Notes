package Operator_And_Binary_number_System;

public class Operator {
    public static void main(String[] args){
        //Opreter are symeboles thet tell compiler to perform some oprtion 

        //1 Arthmetic opreter 

        //+,-,*,/,%

        int  A=10, B=6;
        int a =A +B;
        System.out.println("use + symbale in arthmetic opretion : "+ a);

         int b =A - B;
        System.out.println("use - symbale in arthmetic opretion : "+ b);

         int c =A * B;
        System.out.println("use * symbale in arthmetic opretion : "+ c);

        int d =A / B;
        System.out.println("use / symbale in arthmetic opretion : "+ d);
        
        int e =A % B;
        System.out.println("use % symbale in arthmetic opretion : "+ e);


        //increment opreter
        //incrment opreter are two type like post increment and pre increment 

        //post increment a++

        int F= 10 , G=0;

          G = F++;

        System.out.println("post increment "+F); // first use value
        System.out.println("post increment "+G); // second  Change number 

        //pre increment  ++a

        int H = ++F; 

         System.out.println("pre increment "+F); // first Change value value
        System.out.println("pre increment "+H); // second use value 
        
        
        // Second type Decrement opreter --a or a--
        // ther two type like post decriment or pre dicrement 


        int  i= 10, j =0;

        //post decrement 

        j = i--;

         System.out.println("post decrement :"+i); // first Assine the value
        System.out.println("post Decrement :"+j); //  second Value are chage 

        // pre dicrement 

         int  k = --i;

        System.out.println("pre decriment :" + i); //first value change 
        System.out.println("pre decriment :" + k); // Second valuse asshine 


  // Logical Opreter 
  
        //&& (ther AND opreter ) its use for both are true then answer are true 
        int L = 10,M = 6;

        if(a<b && a>b)// bouth are true then answer are true  
        System.out.println("True");
         System.out.println("false");

        // || (OR Opreter ther are use   ) 
        
        if(a<b || a>b)// any true then answer are true  
        {System.out.println(" any true the answer are True");}
        else{
         System.out.println("false");}

         // ! (NOT opreter ) its use for true convert false and false convert true 

         if(!(L>M))
         {System.out.println("its true");}
        else{
         System.out.println("Convert true to false ");}
        



        



        
    }
}
