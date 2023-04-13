// Scanner class
import java.util.Scanner;

class Example6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
      int a=0;
        
        System.out.println("enter a number : ");
      a=sc.nextInt();
      if(a%2==0)
        System.out.println(a+ "is even");
      else
        System.out.println(a+ "is odd");
    }
}
        
      
      