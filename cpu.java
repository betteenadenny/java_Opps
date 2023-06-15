import java.util.Scanner;
public class cpu {
    double price;
    cpu(double price){
        this.price=price;
    }
    class processor{
        int number_of_cores;
        String manufacturer;
        processor(int n,String m){
            number_of_cores=n;
            manufacturer=m;
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int me,String ma){
            memory=me;
            manufacturer=ma;
        }
    }
    public static void main(String[] args) {
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cpu price:");
        price=input.nextDouble();
    

        cpu obj = new cpu(price);
        System.out.println("Enter no of cores:");
        int no_of_cores=input.nextInt();
        System.out.println("Enter manufacturer:");
        String manufacturer=input.next();
        cpu.processor p= obj.new processor(no_of_cores, manufacturer);


        System.out.println("Enter ram size:");
        int ram_size=input.nextInt();
        System.out.println("Enter ram manufacturer:");
        String ram_manufacturer=input.next();
        cpu.RAM ram = new RAM(ram_size,ram_manufacturer);
        System.out.println("ram manufacturer:"+ram.manufacturer);
        System.out.println("ram size:"+ram.memory);
        System.out.println("no of cores:"+ p.number_of_cores);
        System.out.println("manufacturer:"+p.manufacturer);
        System.out.println("price:"+obj.price);


    }
}
