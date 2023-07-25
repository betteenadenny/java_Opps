import java.util.Scanner;
public class addMatrix {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int rows,cols;

    System.out.println("Enter the number of rows and columns:");
    rows = sc.nextInt();
    cols = sc.nextInt();

    int matrix1[][] = new int[rows][cols];
    int matrix2[][] = new int[rows][cols];
    int sum[][] = new int[rows][cols];

    System.out.println("Enter the elements of the matrix one");
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        matrix1[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Enter the elements of the matrix two");
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        matrix2[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Sum of the two matrix");
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        sum[i][j] = matrix1[i][j] + matrix2[i][j];      
      }
    }
    for (int i = 0; i < rows; i++){ 
      for (int j = 0; j < cols; j++){
        System.out.print(sum[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
