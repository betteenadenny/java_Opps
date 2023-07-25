import java.util.Scanner;
public class readComplex {
  int r,i;
  void readData(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the real and imaginary part for the complex number:");
    r = input.nextInt();
    i = input.nextInt();
  }
  void display(){
    System.out.println(r+" + "+i+"i");
  }
  static void add(int r1,int i1,int r2,int i2){
    int sreal = r1 + r2;
    int simaginary = i1 +i2;
    System.out.println("Sum of these complex numbers are:");
    System.out.println(sreal+" + "+simaginary+"i");
  }
  public static void main(String[] args){
    readComplex c1 = new readComplex();
    readComplex c2 = new readComplex();
    c1.readData();
    c2.readData();
    System.out.println("Entered Complex numbers are:");
    c1.display();
    c2.display();
    add(c1.r,c1.i,c2.r,c2.i);
  }
}
