public class S {

    public static void main(String[] args){
        StringBuilder S = new StringBuilder("Harsh");

        for(int i=0; i<S.length();i++)
        System.out.println(S.charAt(i));

        S.append("Gupta");

        S.insert(5," ");

        //System.out.print(S.length());
        System.out.print(S.indexOf("h"));


    }
}