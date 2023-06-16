import java.util.Scanner;
public class MatrixSortThree {
  public static void main(String[] args) {
    int n,temp=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");
    n= sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the array elements:");
    for( int i=0; i<n; i++ ){
      a[i]=sc.nextInt();
    }
    System.out.println("Array before sorting:");
    for( int i=0; i<n; i++ ){
      System.out.print(a[i]+"\t");
    }
    for( int i=0; i<n; i++ ){
      for( int j=0; j<n; j++ ){
        if(a[i]<a[j]){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
        }
      }
    }
    System.out.println("\nArray after sorting:");
    for( int i=0; i<n; i++ ){
      System.out.print(a[i]+"\t");
    }
  }
}
