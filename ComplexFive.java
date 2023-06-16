import java.util.Scanner;
public class ComplexFive {
  int real, imag;
  public void readValues(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the real and imaginary part for the complex number:");
    real = input.nextInt();
    imag = input.nextInt();
  }
  public static void main(String[] args) {
    ComplexFive a = new ComplexFive();
    ComplexFive b = new ComplexFive();
    ComplexFive c = new ComplexFive();
    a.readValues();
    b.readValues();
    c.real=a.real+b.real;
    c.imag=a.imag+b.imag;
    System.out.println("First complex no: " + a.real + " + " + a.imag+ "i");
    System.out.println("First complex no: " + b.real + " + " + b.imag+ "i");
    System.out.println("Sum= " + c.real + " + " + c.imag+ "i "); 
  }



  // public static void main(String[] args) {
  //   int realOne,realTwo,imgOne,imgTwo,sumReal,sumImg;
  //   Scanner input = new Scanner(System.in);
  //   System.out.println("Enter the real and imaginary part for the first complex number: ");
  //   realOne = input.nextInt();
  //   imgOne = input.nextInt();
  //   System.out.println("Enter the real and imaginary part for the Second complex number: ");
  //   realTwo = input.nextInt();
  //   imgTwo = input.nextInt();
  //   sumReal = realOne + realTwo;
  //   sumImg = imgOne + imgTwo;
  //   System.out.println("Sum= " + sumReal + " + " + sumImg+ "i "); 
  // }
}
