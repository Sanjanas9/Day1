import java.util.Scanner;
class Example4 {
  public static void main(String args[]) {
    
    Scanner s=new Scanner(System.in);
    int salary=0;
    int a=0,b=0,c=0;
    int totalamount=0;
    float p=0;
    System.out.println("enter the salary");
    salary=s.nextInt();
    System.out.println("enter the 3bills");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    totalamount= a+b+c;
    p=(totalamount/100)*salary;
    System.out.println("p:" +p);
 
    
   
  }
}

    