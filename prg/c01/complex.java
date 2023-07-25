public class complex {
  
  int r;
  int i;

  complex(int real,int imag){
    r = real;
    i = imag;
  }
  
  void display(){
    System.out.println(r+" + "+i+"i");
  }
  static void add(int r1,int i1,int r2,int i2){

    int sreal = r1 + r2;
    int simaginary = i1 +i2;
    System.out.println(sreal+" + "+simaginary+"i");
  }

  public static void main(String[] args){

    complex c1 = new complex(23,45);
    complex c2 = new complex(45,23);
    System.out.println("The complex numbers are:");
    c1.display();
    c2.display();
    System.out.println("Sum of these complex numbers are:");
    add(c1.r,c1.i,c2.r,c2.i);
  }
}
