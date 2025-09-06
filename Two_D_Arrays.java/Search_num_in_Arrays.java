import java.util.*;

public class Search_num_in_Arrays {
    public static void main(S[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the row number :");
      int row = sc.nextInt();
      System.out.print("Enter the col number :");
      int col = sc.nextInt();

      int[][] num = new int[row][col];

      System.out.println("Enter the input for metrix :");
      for(int i=0; i<row; i++)
      {
        for(int j=0; j<col;j++)
        {
            num[i][j]=sc.nextInt();
        }
      }

      System.out.println("Enter search number :");
      int search = sc.nextInt();

      for(int i=0; i<row; i++)
      {
        for(int j=0; j<col; j++)
        {
            if(num[i][j]  == search){
                System.out.print("Row Number :"+ i +"  "+ "Col Number :"+j);
            }
        }
      }
    }


}
