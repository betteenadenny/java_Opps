import java.util.Scanner;
public class shapes {
  void area(double r){
    double area_val = 3.14*r*r;
    System.out.println("Area of the circle with radius "+r+" is " + area_val);
  }
  void area(double l,double b){
    double area_val = l*b;
    System.out.println("Area of the rectangle with length "+l+" and breadth "+b+" is " + area_val);
  }
  void area(double l,double b,double h){
    double Area_val = l*b*h;
    System.out.println("\nArea of Cuboid is with dimensions "+l+" X "+b+" X "+h+" = "+Area_val);
  }

  public static void main(String[] args){
    while(true){
      double a,b,c;
      System.out.println("*******Mein menu*******");
      System.out.println("1.circle");
      System.out.println("2.rectangle");
      System.out.println("3.cuboid");
      System.out.println("0.Exit");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the the number corresponding to the shape for finding area");
      int n = input.nextInt();
      shapes obj1 = new shapes();
      switch (n) {
        case 0:System.exit(0);
        case 1:{
          System.out.println("Enter the radius:");
          a = input.nextDouble();
          obj1.area(a);
          break;
        }
        case 2:{
          System.out.println("Enter the length and bredth:");
          a = input.nextDouble();
          b  = input.nextDouble();
          obj1.area(a,b);
          break;
        }
        case 3:{
          System.out.println("Enter the length and bredth and height:");
          a = input.nextDouble();
          b  = input.nextDouble();
          c = input.nextDouble();
          obj1.area(a,b,c);
          break;
        }
        default:
        System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
      }
    }
  } 
}
