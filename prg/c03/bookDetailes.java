//prob in display literature!!!!!!!!


import java.util.Scanner;
class Publisher{
  String publisher;
  Publisher(String publisher){
    this.publisher = publisher;
  }
}
class Book extends Publisher{
  String book;
  Book(String publisher,String book){
    super(publisher);
    this.book = book;
  }
}
class Literature extends Book{
  String category;
  Literature(String publisher,String book,String category){
    super(publisher,book);
    this.category = category;
  }
  void display(){
    System.out.println("Literature book detailes");
    System.out.println("Book name : " + book);
    System.out.println("Book publisher : " + publisher);
    System.out.println("Book category : " + category);
  }
}
class Fiction extends Book{
  String category;
  Fiction(String publisher,String book,String category){
    super(publisher,book);
    this.category = category;
  }
  void display(){
    System.out.println("Fiction book detailes");
    System.out.println("Book name: " + book);
    System.out.println("Book publisher: " + publisher);
    System.out.println("Book category: " + category);
  }
}

public class bookDetailes {
  public static void main(String[] args){
  System.out.println("\n Enter the Literature Book Details\n");
  System.out.println("Enter the number Literature Book :");
  Scanner sc = new Scanner(System.in);
  int lNo = sc.nextInt();
  Literature arr1[] = new Literature[lNo];
  for (int i = 0; i < lNo; i++){
    int x = i +1;
    System.out.println("\n"+x+").");
    System.out.println("Enter book name: ");
    String book = sc.next();
    System.out.println("Enter publisher: ");
    String publisher = sc.next();
    System.out.println("Enter category: ");
    String category = sc.next();
    arr1[i]=new Literature(book,publisher,category);
  }
 
           
  //           arr[i]=new Literature(boo,pub);
  //       }
  System.out.println("\n Enter the Fiction Book Details\n");
  System.out.println("Enter the number Fiction Book :");
  int FNo = sc.nextInt();
  Fiction arr2[] = new Fiction[FNo];
  for (int i = 0; i < FNo; i++){
    int x = i +1;
    System.out.println("\n"+x+").");
    System.out.println("Enter book name: ");
    String book = sc.next();
    System.out.println("Enter publisher: ");
    String publisher = sc.next();
    System.out.println("Enter category: ");
    String category = sc.next();
    arr2[i]=new Fiction(book,publisher,category);
  }
  while(true){
    System.out.println("Mainmenu: ");
    System.out.println("   1.Literature \n   2.Fiction \n   0.Exit");
    System.out.println("Enter number to display: ");
    int n = sc.nextInt();
    switch(n){
      case 0:System.exit(0);
      case 1:
        for(int i=0; i<lNo; i++){
          int x = i +1;
          System.out.println("\n"+x+").");
          arr1[i].display();
      }
      case 2:
        for(int i=0; i<FNo; i++){
          int x = i +1;
          System.out.println("\n"+x+").");
          arr2[i].display();
      }
      default:System.out.println("Enter a valid choice: ");
    }
  }   
  }
}