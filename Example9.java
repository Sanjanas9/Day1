import java.util.Scanner;

class Example9{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a=0;
        System.out.println("Enter number : ");
      a=sc.nextInt();
      if(a>18)
        System.out.println(a+ "is egilible");
      else
        System.out.println(a+ "is not egilible");
    }
}