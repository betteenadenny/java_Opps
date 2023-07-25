package c02;
import java.util.Scanner;
public class employee {
  int eNo;
  String eName;
  double eSalary;
  void readData(){
    System.out.println("Enter employee information:");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name:");
    eName = input.nextLine();
    System.out.print("Enter id number:");
    eNo = input.nextInt();
    System.out.print("Enter salary:");
    eSalary = input.nextDouble();
  }
  void display(){
    System.out.println("Name : " + eName);
    System.out.println("ID NUMBER : " + eNo);
    System.out.println("SALARY : " + eSalary);
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of employees:");
    int count = input.nextInt();
    employee arr[] = new employee[count];
    for(int i=0; i<count; i++) {
      arr[i]=new employee();
      arr[i].readData();
    }
    System.out.println("All EMPLOYEE INFORMATION");
    for(int i=0; i<count; i++) {
        arr[i].display();
    }
  
    // if(flag==1){
    //   arr[pos].display();
    // }
    // 
    int flag = 0, pos = -1;
    System.out.print("\nEnter the Employee Number to get details of a employee");
    int search= input.nextInt();
    for(int i=0;i<count;i++){
      if(arr[i].eNo==search){
        System.out.println("\nEmployee details");
        arr[i].display();
        flag = 1;
        break;
     }
    }
    if(flag != 1){
       System.out.println("No such employee exist in the database");
   } 
  }
}
  
