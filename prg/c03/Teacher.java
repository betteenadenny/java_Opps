import java.util.Scanner;
class empTeacher {
  int emId;
  String name;
  double salary;
  String address;
  empTeacher(int emId, String name, double salary, String address){
    this.emId = emId;
    this.name = name;
    this.salary = salary;
    this.address = address;
  }
}
public class Teacher extends empTeacher{
  String dept;
  String subject;
  Teacher(int empId, String name, double salary, String address, String dept, String subject){
    super(empId,name,salary,address);
    this.dept= dept;
    this.subject=subject;
  }
  void display(){
    System.out.println("Employee id: "+emId);
    System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    System.out.println("Address: "+address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of employees:");
    int n = sc.nextInt();
    Teacher arr[] = new Teacher[n];
    for(int i=0; i<n; i++){
      System.out.println("\nEnter Employee id: ");
      int Empid=sc.nextInt();
      System.out.println("Enter Employee Name: ");
      String Name=sc.next();
      System.out.println("Enter Salary: ");
      double Salary=sc.nextDouble();
      System.out.println("Enter Address: ");
      String Address=sc.next();
      System.out.println("Enter department: ");
      String dept=sc.next();
      System.out.println("Enter Subject: ");
      String subject=sc.next();
      arr[i] = new Teacher(Empid,Name,Salary,Address,dept,subject);
    }
    System.out.println("\nINFORMATION OF ALL THE TEACHERS");
    for(int i=0; i<arr.length; i++){
      arr[i].display();
    }
  }  
}