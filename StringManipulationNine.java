import java.util.Scanner;
public class StringManipulationNine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter a string:");
        str = input.nextLine();
        int length = str.length();
        String uppercase = str.toUpperCase();
        String lowercase = str.toLowerCase();
        System.out.println("Length of the string : "+length);
        System.out.println("Uppercase : "+uppercase);
        System.out.println("Lowercase : "+lowercase);
        System.out.print("Ente starting index for the substring:");
        int startIndex = input.nextInt();
        System.out.print("Ente ending index for the substring:");
        int endIndex = input.nextInt();

        if (startIndex >= 0 && startIndex < length && endIndex >= startIndex && endIndex <= length) {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid substring indices.");
        }

       // Replace a substring
        String s2 = str.replace('e','$');
        System.out.println(s2);
                                             

        
    }
}