import java.util.Scanner;
public class MatrixAddFour {
  public static void main(String[] args) {
    int[][] matrix_1,matrix_2,sum;
    int rows,cols;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size of rows:");
    rows = input.nextInt();
    System.out.println("Enter size of cols:");
    cols = input.nextInt();
    matrix_1 = new int[rows][cols];
    matrix_2 = new int[rows][cols];
    sum = new int[rows][cols];

    System.out.println("Enter matrix One: ");
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        matrix_1[i][j] = input.nextInt();
      }
    }
    System.out.println("Enter matrix Two: ");
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        matrix_2[i][j] = input.nextInt();
      }
    }

    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        sum[i][j]=matrix_2[i][j] + matrix_1[i][j];
      }
    }
    



  //  System.out.println(" matrix One: ");
  //   for (int i = 0; i < rows; i++) {
  //     for(int j = 0; j < cols; j++) {
  //       System.out.println(matrix_1[i][j]+"\t");
  //       //System.out.println("");
  //     }
  //     System.out.println();
  //   } 

   }
}
