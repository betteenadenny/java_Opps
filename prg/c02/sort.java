package c02;
import java.util.Scanner;
import java.util.Arrays;

public class sort {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the no of words: ");
    int n = input.nextInt();
    String words[] = new String[n];
    System.out.println("Enter the words: ");
    for (int i = 0; i < n; i++){
      words[i] = input.next();
    }
    System.out.println("String brfore sorting="+Arrays.toString(words));
    for (int i = 0; i < n; i++){
      for (int j = i+1; j < n; j++){
        if(words[i].compareTo(words[j])>0){
          String temp = words[i];
          words[i]=words[j];
          words[j]=temp;
        }
      }
    }
    System.out.println("Sorted Strings using compareTo function ="+Arrays.toString(words));
    //System.out.println(words);
  }
}
