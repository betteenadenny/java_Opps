package c02;
import java.util.Scanner;
public class stringManipulation {
  public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the string:");
    // String s1 = sc.nextLine();
    // System.out.println("Entered String : "+s1);
    String s1 = "betteena denny";
    String s2 = "hello world ";
    String s3 = "betteena denny";
    System.out.println("Lower case : "+s1.toLowerCase());
    System.out.println("Upper case : "+s1.toUpperCase());
    System.out.println("Length of the string : "+s1.length());
    System.out.println("Replace e with r : "+s1.replace("e", "r"));
    System.out.println(s1.trim());//remove white spaces at the beginning and end of the string
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println("5th character of the string : "+s1.charAt(4));//indexing starting from zero
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
    System.out.println(s2.concat(s1));
    System.out.println("Substring from 4th position : "+s1.substring(3));
    System.out.println("Substring from 4th  to 8th position : "+s1.substring(3,8));
    System.out.println(s1.contains("eena"));
    System.out.println(s2.endsWith("ld "));
    System.out.println(s2.startsWith("hell"));
    System.out.println(s2.replaceAll("ll","@@"));

  }
}
