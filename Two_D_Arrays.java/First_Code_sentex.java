//Ther are print metrix  and use arrays
import java.util.*;
public class First_Code_sentex {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of rows :");
     int row = sc.nextInt();
     System.out.println("Enter the size of col: ");
     int col = sc.nextInt();

     int [][] number = new int[row][col];
     for(int i=0; i<row; i++)
     {
      for(int j=0;j<col;j++){
        number[i][j] = sc.nextInt();
      }
     }
     System.out.println("you can see output");
     for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
       System.out.print(number[i][j]+ " ");
      }
      System.out.println();
     }
    }
}
