import java.util.Scanner;
public class SortStringSeven{
    public static void main(String[] args){
        int count;
        String temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Strings:");
        count = input.nextInt();
        String str[] = new String[count];
        System.out.println("Enter the Strings:");
        for(int i=0;i<count;i++){
            str[i] = input.next();
        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(str[i].compareTo(str[j])>0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("String in sorted order:");    
        for(int i=0;i<count;i++){
            System.out.println(str[i]+" ") ;
        }


}

}
