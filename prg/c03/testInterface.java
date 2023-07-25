import java.util.Scanner;

interface prop{
    void getdata();
    void area();
    void perimeter();
}

class Circle implements prop{
  double radius;
  Scanner sc = new Scanner(System.in);
  @Override
  public void getdata(){
    System.out.println("Enter radius :");
    radius = sc.nextInt();
  }
  @Override
  public void area(){
    double Area = radius * 3.14 *radius ;
    System.out.println("Area : "+Area);
  }
  @Override
  public void perimeter(){
    double Peimeter = radius * 3.14 *2;
    System.out.println("Area : "+Peimeter);
  }
}
class Rectangle implements prop{
  double l,b;
  Scanner sc = new Scanner(System.in);
  @Override
  public void getdata(){
    System.out.println("Enter the length of the rectangle:");
    l = sc.nextDouble();
    System.out.println("Enter the breadth of the rectangle:");
    b = sc.nextDouble();
  }
  @Override
  public void area(){
    System.out.println("Perimeter of a rectangle: "+(l*b));
  }
  @Override
  public void perimeter(){
    System.out.println("Perimeter of a rectangle: "+(2*(l+b)));
  }
}
public class testInterface{
  public static void main(String[] args){
    Rectangle ob1 = new Rectangle();
    Circle ob2 = new Circle();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Main menu");
      System.out.println("\n1.Circle\n2.Rectangle\n3.exit");
      System.out.println("Enter your choice:");
      int ch = sc.nextInt();
      switch(ch) {
        case 1:ob2.getdata();
              ob2.perimeter();
              ob2.area();
              break;
        case 2:ob1.getdata();
              ob1.perimeter();
              ob1.area();
              break;
        case 3:System.exit(0);
        default:System.out.println("Enter a valid choice");

      }
    }

  }
}
