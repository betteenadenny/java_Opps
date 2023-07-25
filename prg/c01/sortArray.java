import java.util.Scanner;
public class sortArray {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = input.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the array elements :");
    for(int i=0;i<n;i++){
        a[i] = input.nextInt();
    }
    System.out.println("Array before sorting:");
    for( int i=0; i<n; i++ ){
      System.out.print(a[i]+"\t");
    }
    int temp = 0;
    for( int i=0; i<n; i++ ){
      for( int j=i+1; j<n; j++ ){
        if(a[i]>a[j]){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
        }
      }
    }
    System.out.println();
    System.out.println("Array after sorting:");
    for( int i=0; i<n; i++ ){
      System.out.print(a[i]+"\t");
    }
  } 
}
