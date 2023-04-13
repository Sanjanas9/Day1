import java.util.Scanner;

class Example8{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a;
        System.out.println("Enter number : ");
      a=sc.nextInt();
      if(a>18)
        System.out.println(a+ "is egilible");
      else
        System.out.println(a+ "is not egilible");
    }
}