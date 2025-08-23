package String;

public class String_all_concept {
    public static void main(String[] args){
        String name = "Harsh";
        String S_name = "Gupta";
        String Full_name =name + " " + S_name;
        System.out.println(Full_name);


        // length Of string 
        System.out.println(Full_name.length());

        //charAt(index number provide thet return) ther are use for index value are print 

        for(int i=0; i<Full_name.length(); i++)// loop for all value for print 
        {
            System.out.println(Full_name.charAt(i));
        }

        //string Compare 

        String str1 = "Harsh";
        String str2 = "Harsh";

        //1 str1 > str2 : +ve value return
        //2 str1 == str2 : return 0
        //3 str1 < str2 : -ve value return  
        System.out.println(str1.compareTo(str2)); // output  0 
        System.out.println(name.compareTo(S_name));// positve number 1

        //example 

        String s1 = "Tony";
        String s2 = "Tony";

        // compare a and b me sabase bada value b hota hai
        if(s1.compareTo(s2)==0){
            System.out.println("Bothe String are equal");
        }else{
            System.out.println("Both String are not equel");
        }


        //Subtring(Starting index number , end index number  );
        //Ther are use for Small part are dislay to string 

        //Example 
        // index are strting 0 to end 0,1,2,3,4 ther fore 
        String s3 = "My name is harsh";
        System.out.println(s3.substring(11));// output  harsh becouse ther are h are present 11 index ending poit by default get all last 
        System.out.println(s3.substring(3,7)); // strting point and ending point 

        // string are immutable
    }
   
}
