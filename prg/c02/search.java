package c02;

import java.util.Scanner;

public class search {
  public static void main(String[] args){
    int pos = 0,flag = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the no of words: ");
    int n = input.nextInt();
    String words[] = new String[n];
    System.out.println("Enter the words: ");
    for (int i = 0; i < n; i++){
      words[i] = input.next();
    }
    System.out.print("Enter the element to be searched:");
    String element = input.next();
    for(int i = 0; i < n; i++){
      if(words[i].equals(element)){
        flag = 1;
        pos = i+1;
        break;
      }
    }
    if(flag == 1){
      System.out.println("Element found at position "+pos);
    }
    else{
      System.out.println("Element is not found");
    }
  }
}
