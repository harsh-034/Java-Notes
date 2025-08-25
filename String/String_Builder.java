package String;

public class String_Builder {

    public static void main(String[] args){
        //String in Java are immutable becouse i will not cange after one time decration    

        StringBuilder name = new StringBuilder("harsh");
        System.out.println(name);  //output harsh

        // charAt( index number )   this is index number are get and return value of thish number 

        //Example
         System.out.println(name.charAt(3));// output: s

         //Thet use index function ther are use for serching 
         System.out.println("use of index function for search :"+name.indexOf("s"));

         System.out.println("use lest index number function are use:" + name.lastIndexOf("h"));


         //setcharAt(indexnumber, replace value )  ther use for replace value on index number 

         // example 
         StringBuilder S_name = new  StringBuilder("Gupta");

         S_name.setCharAt(0,'H'); //index no 0 (G) replace to H
         System.out.println(S_name); // Hupta

         // insert(index no, add string ) insert function are use for add index number new string 

         // example
         S_name.insert(0,"G");
         System.out.println(S_name);  // output : GHupta 

         S_name.insert(3,"p");
         System.out.println(S_name);// output : GHuppta

         // Delete(index number are strting , index num are end)
         
         //Delete extra p
         S_name.delete(3,4); // extra p are deleted
         System.out.println(S_name);

         //append(string add stake formet )
         // 
         StringBuilder str = new StringBuilder("H");
         str.append("e");  // ther are string use then str + "e"  its lendie and consume lot time 
         str.append("l");  
         str.append("l");
         str.append("o");
         System.out.println(str); //output: hello 
         
         //length

         System.out.println(str.length());

         //reverse are use for ulta
          str.reverse();
          System.out.println(str);// reverse are output :  olleh


          


    }
}