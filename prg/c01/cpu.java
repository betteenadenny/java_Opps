public class cpu{
  int price;
  cpu(int price){
    this.price = price;
  }
  void display(){
    System.out.println("\nCPU info");
    System.out.println("Price = "+price);
  }
  class processor{
    int cores;
    String producer;
    processor(int noC, String manu){
        cores=noC;
        producer=manu;
    }
    void display(){
    System.out.println("\nProcessor info");
    System.out.println("No. of Cores = "+cores);
    System.out.println("Manufacturer = "+producer+"\n");
    }
  }
  static class ram{
    int mem;
    String manuf;
    ram(int memory,String producer ){
        mem=memory;
        manuf=producer;
    }
    void display(){
    System.out.println("\nRAM info");
    System.out.println("Memory = "+mem+" GB");
    System.out.println("Manufacturer = "+manuf+"\n");
    }
  }
  
    public static void main(String[] args) {
      cpu obj1 = new cpu(40000);
      obj1.display();

      cpu.processor obj2 = obj1.new processor(8,"Samsung");
      obj2.display();

      cpu.ram obj3 = new cpu.ram(8,"Intel");
      obj3.display();
         

    }
}