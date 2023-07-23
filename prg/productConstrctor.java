public class productConstrctor {
  
  int pcode;
  String pname;
  double price;

  productConstrctor(int pc, String pn ,double pr){
    pcode = pc;
    pname = pn;
    price = pr;
  }

  void display(){
    System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
  }

  static void findLowest(double pr1,double pr2, double pr3){
    if(pr1<=pr2 && pr1<=pr3){
        System.out.println("\nProduct 1 is of the lowest price!");
        
    }
    else if(pr2<=pr1 && pr2<=pr3){
        System.out.println("\nProduct 2 is of the lowest price!");
        
    }
    else{
        System.out.println("\nProduct 3 is of the lowest price!");
        
    }  
  }

  public static void main(String[] args) {
    
    productConstrctor p1 = new productConstrctor(101, "soap", 30);
    productConstrctor p2 = new productConstrctor(102, "paste", 20);
    productConstrctor p3 = new productConstrctor(103, "brush", 25);


    System.out.println("pcode\t\tpname\t\tprice"); 
    p1.display();
    p2.display();
    p3.display();
    findLowest(p1.price,p2.price,p3.price);


  }


}