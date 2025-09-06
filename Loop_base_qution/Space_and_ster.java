/* 
  
  
   *
  **
 ***
****    
 
*/
 





public class Space_and_ster {
   public static void main(S[] args) {
    int n=4;

    for(int i=1; i<=n; i++)//1
    {
      for(int j=1; j<=n-i;j++)//4-1
      {
        System.out.print(" ");// print 3 bar print 
      }
      for(int j=1; j<=i;j++)//i=1 then print 1 time * j ke bad continoue karega 
      {
        System.out.print("*");
      }
      System.out.println("");//new line 
    }
   }
    
}
